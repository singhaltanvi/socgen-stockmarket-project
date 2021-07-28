package com.tanvi.companyservice.dto;

import java.util.List;

public class CompanyDto {

    private int id;

    private String companyName;

    private int turnOver;

    private int sectorId;

    private String description;

    private List<String> stockExchangeNames;

    public CompanyDto() {
    }

    public CompanyDto(int id, String companyName, int turnOver, int sectorId, String description,
                      List<String> stockExchangeNames) {
        super();
        this.id = id;
        this.companyName = companyName;
        this.turnOver = turnOver;
        this.sectorId = sectorId;
        this.description = description;
        this.stockExchangeNames = stockExchangeNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTurnOver() {
        return turnOver;
    }

    public void setTurnOver(int turnOver) {
        this.turnOver = turnOver;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getStockExchangeNames() {
        return stockExchangeNames;
    }

    public void setStockExchangeNames(List<String> stockExchangeNames) {
        this.stockExchangeNames = stockExchangeNames;
    }



}