package com.entity;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public class FlightTickets implements Serializable {
    private Integer id;
    private Integer flightId;
    @JSONField
    private java.util.Date flightDate;
    private Integer ticketPrice;
    private String sellCompany;
    
    //数据表关联字段
    private Flights flights;
    
    public FlightTickets() {
        super();
    }
    public FlightTickets(Integer id,Integer flightId,java.util.Date flightDate,Integer ticketPrice,String sellCompany) {
        super();
        this.id = id;
        this.flightId = flightId;
        this.flightDate = flightDate;
        this.ticketPrice = ticketPrice;
        this.sellCompany = sellCompany;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFlightId() {
        return this.flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public java.util.Date getFlightDate() {
        return this.flightDate;
    }

    public void setFlightDate(java.util.Date flightDate) {
        this.flightDate = flightDate;
    }

    public Integer getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getSellCompany() {
        return this.sellCompany;
    }

    public void setSellCompany(String sellCompany) {
        this.sellCompany = sellCompany;
    }
	public Flights getFlights() {
		return flights;
	}
	public void setFlights(Flights flights) {
		this.flights = flights;
	}

}
