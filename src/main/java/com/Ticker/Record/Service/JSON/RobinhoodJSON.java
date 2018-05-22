package com.Ticker.Record.Service.JSON;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * {
	"ask_price":"95.0900",
	"ask_size":1100,
	"bid_price":"95.0500",
	"bid_size":300,
	"last_trade_price":"95.0000",
	"last_extended_hours_trade_price":"95.0900",
	"previous_close":"96.1100",
	"adjusted_previous_close":"96.1100",
	"previous_close_date":"2018-04-19",
	"symbol":"MSFT",
	"trading_halted":false,
	"has_traded":true,
	"last_trade_price_source":"consolidated",
	"updated_at":"2018-04-20T23:24:10Z",
	"instrument":"https://api.robinhood.com/instruments/50810c35-d215-4866-9758-0ada4ac79ffa/"
}
 * */
public class RobinhoodJSON {
	@JsonProperty(value="ask_price")
	private float askPrice;
	@JsonProperty(value="ask_size")
	private int askSize;
	@JsonProperty(value="bid_price")
	private float bidPrice;
	@JsonProperty(value="bid_size")
	private int bidSize;
	@JsonProperty(value="last_trade_price")
	private float lastTradePrice;
	@JsonProperty(value="last_extended_hours_trade_price")
	private float lastExtendedHoursTradePrice;
	@JsonProperty(value="previous_close")
	private float previousClose;
	@JsonProperty(value="previous_close_date")
	private Date previousCloseDate;
	@JsonProperty(value="adjusted_previous_close")
	private float adjustedPreviousClose;
	@JsonProperty(value="symbol")
	private String symbol;
	@JsonProperty(value="trading_halted")
	private boolean tradingHalted;
	@JsonProperty(value="has_traded")
	private boolean hasTraded;
	@JsonProperty(value="last_trade_price_source")
	private String lastTradePriceSource;
	@JsonProperty(value="updated_at")
	private Date updatedAt;
	@JsonProperty(value="instrument")
	private String instrument;
	
	public float getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(float askPrice) {
		this.askPrice = askPrice;
	}
	public int getAskSize() {
		return askSize;
	}
	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}
	public float getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(float bidPrice) {
		this.bidPrice = bidPrice;
	}
	public int getBidSize() {
		return bidSize;
	}
	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}
	public float getLastTradePrice() {
		return lastTradePrice;
	}
	public void setLastTradePrice(float lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}
	public float getLastExtendedHoursTradePrice() {
		return lastExtendedHoursTradePrice;
	}
	public void setLastExtendedHoursTradePrice(float lastExtendedHoursTradePrice) {
		this.lastExtendedHoursTradePrice = lastExtendedHoursTradePrice;
	}
	public float getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(float previousClose) {
		this.previousClose = previousClose;
	}
	public Date getPreviousCloseDate() {
		return this.previousCloseDate;
	}
	public void setPreviousCloseDate(Date previousCloseDate) {
		this.previousCloseDate = previousCloseDate;
	}
	public float getAdjustedPreviousClose() {
		return adjustedPreviousClose;
	}
	public void setAdjustedPreviousClose(float adjustedPreviousClose) {
		this.adjustedPreviousClose = adjustedPreviousClose;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public boolean isTradingHalted() {
		return tradingHalted;
	}
	public void setTradingHalted(boolean tradingHalted) {
		this.tradingHalted = tradingHalted;
	}
	public boolean isHasTraded() {
		return hasTraded;
	}
	public void setHasTraded(boolean hasTraded) {
		this.hasTraded = hasTraded;
	}
	public String getLastTradePriceSource() {
		return lastTradePriceSource;
	}
	public void setLastTradePriceSource(String lastTradePriceSource) {
		this.lastTradePriceSource = lastTradePriceSource;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getInstrument() {
		return instrument;
	}
	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	
}
