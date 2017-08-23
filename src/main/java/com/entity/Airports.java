package com.entity;

import java.io.Serializable;
import java.util.List;

public class Airports implements Serializable {
    private Integer id;
    private String airportName;
    private String cityName;
    
    //数据表关联字段
    private List<Flights> flights;
    
    public Airports() {
        super();
    }
    public Airports(Integer id,String airportName,String cityName) {
        super();
        this.id = id;
        this.airportName = airportName;
        this.cityName = cityName;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirportName() {
        return this.airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
	public List<Flights> getFlights() {
		return flights;
	}
	public void setFlights(List<Flights> flights) {
		this.flights = flights;
	}

}
