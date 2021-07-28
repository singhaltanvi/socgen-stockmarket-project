package com.tanvi.stockexchangeservice.controller;

import com.tanvi.stockexchangeservice.dto.CompanyDto;
import com.tanvi.stockexchangeservice.dto.StockExchangeDto;
import com.tanvi.stockexchangeservice.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.TypeToken;
import org.modelmapper.ModelMapper;

import java.util.List;

@RestController
@RequestMapping("/stockexchanges")
public class StockExchangeController {
    @Autowired
    private StockExchangeService stockExchangeService;

    @GetMapping("/stock-exchange")
    public List<StockExchangeDto> getAllStockExchange(){
        return stockExchangeService.findAllStockExchange();
    }

    @PostMapping("/addStockExchange")
    public StockExchangeDto addStockExchange(@RequestBody StockExchangeDto dto) throws Exception {
        return stockExchangeService.addStockExchange(dto);
    }

    @GetMapping("/stockExchange/{name}/all-company")
    public List<CompanyDto> findAllCompanyInStockExchange(@PathVariable("name") String name){
        return stockExchangeService.findAllCompanyInStockExchange(name);
    }
}
