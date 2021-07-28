package com.tanvi.stockexchangeservice.repository;

import com.tanvi.stockexchangeservice.model.StockExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockExchangeRepo extends JpaRepository<StockExchange, Integer>{

    public StockExchange findByStockExchangeName(String stockExchangeName);
}
