package com.Ticker.Record.Service.services;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ticker.Record.Service.JSON.RobinhoodJSON;
import com.Ticker.Record.Service.entities.TickerRecordEntity;
import com.Ticker.Record.Service.repositories.TickerRecordRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RecordService {
	
	@Autowired
	TickerRecordRepository tickerRecordRepository;
	
	
	public String pullSymbol(String symbol) {
		try {
			System.out.println("Pulling: " + "https://api.robinhood.com/quotes/" + symbol + "/");
			return makeRequest("https://api.robinhood.com/quotes/" + symbol + "/");
		} catch (ParseException | IOException e) {
			e.printStackTrace();
			return e.toString();
		}
	}
	
	public String makeRequest(String uri) throws ParseException, IOException {
		try {
			CloseableHttpClient client = HttpClientBuilder.create().build();
			
			CloseableHttpResponse response = client.execute(new HttpGet(uri));
			if (response.getStatusLine().getStatusCode() == 200) {
				
				return EntityUtils.toString(response.getEntity());
			}
			
			return String.valueOf(response.getStatusLine().getStatusCode());
		} catch (ParseException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
	}
	
	public RobinhoodJSON makeJSONFromString(String data) throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		RobinhoodJSON robinhoodJSON = mapper.readValue(data, RobinhoodJSON.class);
		
		return robinhoodJSON;
	}
	
	public TickerRecordEntity JSONToEntity(RobinhoodJSON json) {
		return new TickerRecordEntity(json);
	}
	
	public boolean saveTicker(String symbol) {
		try {
			String tickerData = pullSymbol(symbol);
			RobinhoodJSON json = makeJSONFromString(tickerData);
			TickerRecordEntity entity = new TickerRecordEntity(json);
			tickerRecordRepository.save(entity);
			
			return true;
		} catch (Exception e ) {
			e.printStackTrace();
			return false;
		}
	}
	
	public String testConnection() {
		try {
			
			
			return null;
		} catch (Exception e) {
			return e.toString();
		}
	}
	
}
