package com.entity;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Flights implements Serializable {
    private Integer id;
    private String flightCode;   
    @JSONField
    private java.util.Date flightDate;
    private String airline;
    private String type;
    private Integer takeAirportId;
    private Integer landingAirportId;    
    @JSONField
    private java.util.Date takeTime;
    @JSONField
    private java.util.Date landingTime;
    @JSONField
    private String flightTime;
    private String stopAirport;
    private Double referencePrice;
    
    //数据表关联字段
    @JSONField(serialzeFeatures=SerializerFeature.DisableCircularReferenceDetect)
    private List<FlightTickets> flightTickets;
    @JSONField(serialzeFeatures=SerializerFeature.DisableCircularReferenceDetect)
    private Airports takeAirports;
    @JSONField(serialzeFeatures=SerializerFeature.DisableCircularReferenceDetect)
    private Airports landingAirports;
    

	public Flights() {
        super();
    }
    public Flights(Integer id,String flightCode,java.util.Date flightDate,String airline,String type,Integer takeAirportId,Integer landingAirportId,java.util.Date takeTime,java.util.Date landingTime,String flightTime,String stopAirport,Double referencePrice) {
        super();
        this.id = id;
        this.flightCode = flightCode;
        this.flightDate = flightDate;
        this.airline = airline;
        this.type = type;
        this.takeAirportId = takeAirportId;
        this.landingAirportId = landingAirportId;
        this.takeTime = takeTime;
        this.landingTime = landingTime;
        this.flightTime = flightTime;
        this.stopAirport = stopAirport;
        this.referencePrice = referencePrice;
    }
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightCode() {
        return this.flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public java.util.Date getFlightDate() {
        return this.flightDate;
    }

    public void setFlightDate(java.util.Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getAirline() {
        return this.airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTakeAirportId() {
        return this.takeAirportId;
    }

    public void setTakeAirportId(Integer takeAirportId) {
        this.takeAirportId = takeAirportId;
    }

    public Integer getLandingAirportId() {
        return this.landingAirportId;
    }

    public void setLandingAirportId(Integer landingAirportId) {
        this.landingAirportId = landingAirportId;
    }

    public java.util.Date getTakeTime() {
        return this.takeTime;
    }

    public void setTakeTime(java.util.Date takeTime) {
        this.takeTime = takeTime;
    }

    public java.util.Date getLandingTime() {
        return this.landingTime;
    }

    public void setLandingTime(java.util.Date landingTime) {
        this.landingTime = landingTime;
    }

    public String getFlightTime() {
        return this.flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getStopAirport() {
        return this.stopAirport;
    }

    public void setStopAirport(String stopAirport) {
        this.stopAirport = stopAirport;
    }

    public Double getReferencePrice() {
        return this.referencePrice;
    }

    public void setReferencePrice(Double referencePrice) {
        this.referencePrice = referencePrice;
    }
    
    
    public Airports getTakeAirports() {
		return takeAirports;
	}
	public void setTakeAirports(Airports takeAirports) {
		this.takeAirports = takeAirports;
	}
	public Airports getLandingAirports() {
		return landingAirports;
	}
	public void setLandingAirports(Airports landingAirports) {
		this.landingAirports = landingAirports;
	}
    
	public List<FlightTickets> getFlightTickets() {
		return flightTickets;
	}
	public void setFlightTickets(List<FlightTickets> flightTickets) {
		this.flightTickets = flightTickets;
	}

}
