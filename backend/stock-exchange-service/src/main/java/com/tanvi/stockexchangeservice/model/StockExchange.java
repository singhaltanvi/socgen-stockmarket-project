package com.tanvi.stockexchangeservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class StockExchange {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_exchange_id")
    private int stockExchangeId;

    @Column(name = "stock_exchange_name")
    private String stockExchangeName;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "remarks")
    private String remarks;

    @ManyToMany(mappedBy = "stockExchangeList")
    private List<Company> companyList = new ArrayList<>();

    public StockExchange() {
        super();
    }

    public int getId() {
        return stockExchangeId;
    }

    public void setId(int stockExchangeId) {
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


    public int getStockExchangeId() {
        return stockExchangeId;
    }

    public void setStockExchangeId(int stockExchangeId) {
        this.stockExchangeId = stockExchangeId;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void addCompanyList(Company company) {
        this.companyList.add(company);
    }

    @Override
    public String toString() {
        return "StockExchange [stockExchangeId=" + stockExchangeId + ", stockExchangeName=" + stockExchangeName + ", description=" + description
                + ", address=" + address + ", remarks=" + remarks + "]";
    }


}