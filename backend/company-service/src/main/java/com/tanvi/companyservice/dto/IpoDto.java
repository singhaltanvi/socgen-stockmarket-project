package com.tanvi.companyservice.dto;

public class IpoDto {

    private int id;

    private int stockExchangeId;

    private int pricePerShare;

    private int totalShares;

    private int companyId;

    public IpoDto() {
        super();
    }

    public IpoDto(int id, int stockExchangeId, int pricePerShare, int totalShares, int companyId) {
        super();
        this.id = id;
        this.stockExchangeId = stockExchangeId;
        this.pricePerShare = pricePerShare;
        this.totalShares = totalShares;
        this.companyId = companyId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockExchangeId() {
        return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }

    public int getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(int pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    public int getTotalShare() {
        return totalShares;
    }

    public void setTotalShare(int totalShares) {
        this.totalShares = totalShares;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

}