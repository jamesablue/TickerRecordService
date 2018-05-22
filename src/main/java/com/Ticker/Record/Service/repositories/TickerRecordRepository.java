package com.Ticker.Record.Service.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Ticker.Record.Service.entities.TickerRecordEntity;

@Repository("TickerRecordRepository")
public interface TickerRecordRepository extends CrudRepository<TickerRecordEntity, Long> {
	@Query("SELECT count(*) FROM TickerRecordEntity")
	public int testConnection();
}
