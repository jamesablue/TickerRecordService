package com.Ticker.Record.Service.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.Ticker.Record.Service.JSON.RobinhoodJSON;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name="\"TickRecords\"", schema="public")
public class TickerRecordEntity {
	@Id
	@SequenceGenerator(name="pk_sequence", sequenceName="\"TickRecords_ID_seq\"", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pk_sequence")
	@Column(name="\"ID\"")
	private BigInteger ID;
	@Column(name="\"ASK_PRICE\"", nullable=true)
	private float askPrice;
	@Column(name="\"ASK_SIZE\"", nullable=true)
	private int askSize;
	@Column(name="\"BID_PRICE\"", nullable=true)
	private float bidPrice;
	@Column(name="\"BID_SIZE\"", nullable=true)
	private int bidSize;
	@Column(name="\"LAST_TRADE_PRICE\"", nullable=true)
	private float lastTradePrice;
	@Column(name="\"LAST_EXTENDED_HOURS_TRADE_PRICE\"", nullable=true)
	private float lastExtendedHoursTradePrice;
	@Column(name="\"PREVIOUS_CLOSE\"", nullable=true)
	private float previousClose;
	@Column(name="\"ADJUSTED_PREVIOUS_CLOSE\"", nullable=true)
	private float adjustedPreviousClose;
	@Column(name="\"PREVIOUS_CLOSE_DATE\"", nullable=true)
	private Date previousCloseDate;
	@Column(name="\"SYMBOL\"", nullable=true)
	private String symbol;
	@Column(name="\"TRADING_HALTED\"", nullable=true)
	private boolean tradingHalted;
	@Column(name="\"HAS_TRADED\"", nullable=true)
	private boolean hasTraded;
	@Column(name="\"LAST_TRADE_PRICE_SOURCE\"", nullable=true)
	private String lastTradePriceSource;
	@Column(name="\"UPDATED_AT\"", nullable=true, columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
	private Date updatedAt;
	@Column(name="\"INSTRUMENT\"", nullable=true)
	private String instrument;
	@Column(name="\"TIME_ENTERED\"", nullable=true, columnDefinition="TIMESTAMP WITHOUT TIME ZONE")
	private Date timeEntered;
	
	public TickerRecordEntity() {}
	
	public TickerRecordEntity(RobinhoodJSON json) {
		this.askPrice = json.getAskPrice();
		this.askSize = json.getAskSize();
		this.bidPrice = json.getBidPrice();
		this.bidSize = json.getBidSize();
		this.lastTradePrice = json.getLastTradePrice();
		this.lastExtendedHoursTradePrice = json.getLastExtendedHoursTradePrice();
		this.previousClose = json.getPreviousClose();
		this.adjustedPreviousClose = json.getAdjustedPreviousClose();
		this.previousCloseDate = json.getPreviousCloseDate();
		this.symbol = json.getSymbol();
		this.tradingHalted = json.isTradingHalted();
		this.hasTraded = json.isHasTraded();
		this.lastTradePriceSource = json.getLastTradePriceSource();
		this.updatedAt = json.getUpdatedAt();
		this.instrument = json.getInstrument();
		this.timeEntered = new Date();
	}
	
	public TickerRecordEntity(BigInteger iD, float askPrice, int askSize, float bidPrice, int bidSize, float lastTradePrice,
			float lastExtendedHoursTradePrice, float previousClose, float adjustedPreviousClose, String symbol, Date previousCloseDate,
			boolean tradingHalted, boolean hasTraded, String lastTradePriceSource, Date updatedAt, String instrument,
			Date timeEntered) {
		ID = iD;
		this.askPrice = askPrice;
		this.askSize = askSize;
		this.bidPrice = bidPrice;
		this.bidSize = bidSize;
		this.lastTradePrice = lastTradePrice;
		this.lastExtendedHoursTradePrice = lastExtendedHoursTradePrice;
		this.previousClose = previousClose;
		this.adjustedPreviousClose = adjustedPreviousClose;
		this.previousCloseDate = previousCloseDate;
		this.symbol = symbol;
		this.tradingHalted = tradingHalted;
		this.hasTraded = hasTraded;
		this.lastTradePriceSource = lastTradePriceSource;
		this.updatedAt = updatedAt;
		this.instrument = instrument;
		this.timeEntered = timeEntered;
	}
	
	@Override
	public String toString() {
		return "TickerRecordEntity [ID=" + ID + ", askPrice=" + askPrice + ", askSize=" + askSize + ", bidPrice="
				+ bidPrice + ", bidSize=" + bidSize + ", lastTradePrice=" + lastTradePrice
				+ ", lastExtendedHoursTradePrice=" + lastExtendedHoursTradePrice + ", previousClose=" + previousClose
				+ ", adjustedPreviousClose=" + adjustedPreviousClose + ", symbol=" + symbol + ", tradingHalted="
				+ tradingHalted + ", hasTraded=" + hasTraded + ", lastTradePriceSource=" + lastTradePriceSource
				+ ", updatedAt=" + updatedAt + ", instrument=" + instrument + ", timeEntered=" + timeEntered
				+ ", getID()=" + getID() + ", getAskPrice()=" + getAskPrice() + ", getAskSize()=" + getAskSize()
				+ ", getBidPrice()=" + getBidPrice() + ", getBidSize()=" + getBidSize() + ", getLastTradePrice()="
				+ getLastTradePrice() + ", getLastExtendedHoursTradePrice()=" + getLastExtendedHoursTradePrice()
				+ ", getPreviousClose()=" + getPreviousClose() + ", getAdjustedPreviousClose()="
				+ getAdjustedPreviousClose() + ", getSymbol()=" + getSymbol() + ", isTradingHalted()="
				+ isTradingHalted() + ", isHasTraded()=" + isHasTraded() + ", getLastTradePriceSource()="
				+ getLastTradePriceSource() + ", getUpdatedAt()=" + getUpdatedAt() + ", getInstrument()="
				+ getInstrument() + ", getTimeEntered()=" + getTimeEntered() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public BigInteger getID() {
		return ID;
	}
	public void setID(BigInteger iD) {
		ID = iD;
	}
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
	public float getAdjustedPreviousClose() {
		return adjustedPreviousClose;
	}
	public void setAdjustedPreviousClose(float adjustedPreviousClose) {
		this.adjustedPreviousClose = adjustedPreviousClose;
	}
	public Date getPreviousCloseDate() {
		return previousCloseDate;
	}
	public void setPreviousCloseDat(Date previousCloseDate) {
		this.previousCloseDate = previousCloseDate;
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
	public Date getTimeEntered() {
		return timeEntered;
	}
	public void setTimeEntered(Date timeEntered) {
		this.timeEntered = timeEntered;
	}
	
	
}
