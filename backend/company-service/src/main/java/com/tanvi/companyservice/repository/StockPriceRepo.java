package com.tanvi.companyservice.repository;

import java.time.LocalDate;
import java.util.List;

import com.tanvi.companyservice.model.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface StockPriceRepo extends JpaRepository<StockPrice, Integer>{

    @Query(value="select * from stock_price where company_id = :company_id and date Between :start_date and :end_date", nativeQuery=true)
    public List<StockPrice> findStockPriceDetails(@Param("company_id") int compnayId,
                                                  @Param("start_date") LocalDate startDate,
                                                  @Param("end_date")LocalDate endDate);
}