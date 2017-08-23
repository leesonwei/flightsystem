package com.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.common.Assist;
import com.entity.Flights;
import com.service.FlightsService;

@RestController
public class FlightsController {
	@Autowired
	private FlightsService flightsService;
	
	@RequestMapping("/findflights/{flightDate}/{takeAirportId}/{landingAirportId}")
	public List<Flights> findFlights(@PathVariable("flightDate") String flightDate,
									@PathVariable("takeAirportId") String takeAirportId,
									@PathVariable("landingAirportId") String landingAirportId) throws ParseException{
		/*Assist assist=new Assist();
		System.out.print(flightDate);
		if(null!=flightDate){
			assist.setRequires(Assist.and_eq("flight_date", flightDate));
		}
		if(null!=takeAirportId){
			assist.setRequires(Assist.and_eq("take_airport_id", String.valueOf(takeAirportId)));
		}
		if(null!=landingAirportId){
			assist.setRequires(Assist.and_eq("landing_airport_id", String.valueOf(landingAirportId)));
		}*/
		Flights flights=new Flights();
		flights.setFlightDate(new SimpleDateFormat("yyyy-MM-dd").parse(flightDate));
		flights.setTakeAirportId(Integer.valueOf(takeAirportId));
		flights.setLandingAirportId(Integer.valueOf(landingAirportId));
		return flightsService.selectFlightsAllInfo(flights);
	}
	
	@RequestMapping("/findflight/{id}")
	public Flights findFlights(@PathVariable("id") Integer id){
		return flightsService.selectFlightsById(id);
	}
}
