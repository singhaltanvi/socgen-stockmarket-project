package com.tanvi.stockexchangeservice.dto;

import javax.persistence.Column;

public class StockExchangeDto {

    private int stockExchangeId;

    private String stockExchangeName;

    private String description;

    private String address;

    private String remarks;

    public StockExchangeDto(int stockExchangeId, String stockExchangeName, String description, String address,
                            String remarks) {
        super();
        this.stockExchangeId = stockExchangeId;
        this.stockExchangeName = stockExchangeName;
        this.description = description;
        this.address = address;
        this.remarks = remarks;
    }

    public StockExchangeDto() {
        super();
    }

    public int getStockExchangeId() {
        return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }

    public String getStockExchangeName() {
        return stockExchangeName;
    }

    public void setStockExchangeName(String stockExchangeName) {
        this.stockExchangeName = stockExchangeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "StockExchangeDto [stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName
                + ", description=" + description + ", address=" + address + ", remarks=" + remarks + "]";
    }


}