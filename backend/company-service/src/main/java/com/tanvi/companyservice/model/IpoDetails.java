package com.tanvi.companyservice.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class IpoDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "stock_exchange_id")
    private int stockExchangeId;

    @Column(name = "price_per_share")
    private int pricePerShare;

    @Column(name = "total_shares")
    private int totalShares;

    @Column(name = "open_date_time")
    private LocalDateTime openDateTime;

    @ManyToOne
    private Company company;

    public IpoDetails() {
        super();
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

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public LocalDateTime getOpenDateTime() {
        return openDateTime;
    }

    public void setOpenDateTime(LocalDateTime openDateTime) {
        this.openDateTime = openDateTime;
    }

    @Override
    public String toString() {
        return "IpoDetails [id=" + id + ", stockExchangeId=" + stockExchangeId + ", pricePerShare=" + pricePerShare
                + ", totalShares=" + totalShares + ", openDateTime=" + openDateTime + ", company=" + company + "]";
    }


}