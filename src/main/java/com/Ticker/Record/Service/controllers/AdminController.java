package com.Ticker.Record.Service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ticker.Record.Service.services.RecordService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	RecordService recordService;
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/testConnection")
	public String testConnection() {
		return "test";
	}
	
	@RequestMapping("/get/{symbol}")
	public String getSymbol(@PathVariable("symbol") String symbol) {
		return recordService.pullSymbol(symbol);
	}
	
	@RequestMapping("/save/{symbol}")
	public boolean saveSymbol(@PathVariable("symbol") String symbol) {
		return recordService.saveTicker(symbol);
	}
	
}
