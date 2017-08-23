package com.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.Assist;
import com.entity.FlightTickets;
import com.service.FlightTicketsService;

@RestController
public class FlightTicketsController {
	@Autowired
	private FlightTicketsService flightTicketsService;
	
	@RequestMapping("/flightticket")
	public List<FlightTickets> findFlightsTicket(FlightTickets flightTickets){
		Assist assist=new Assist();
		if (null!=flightTickets.getId()||"".equals(flightTickets.getId())) {
			assist.setRequires(Assist.and_eq("id", String.valueOf(flightTickets.getId())));
		}
		return flightTicketsService.selectFlightTicketsAllInfo(assist);
	}
	
	@RequestMapping("/findtickets")
	public List<FlightTickets> findTicket(FlightTickets flightTickets){
		Assist assist=null;
			assist=new Assist();
			if (null!=flightTickets.getId()) {
				assist.setRequires(Assist.and_eq("id", String.valueOf(flightTickets.getId())));
			}else {
				assist=null;
			}
			if (null!=flightTickets.getFlightId()) {
				assist.setRequires(Assist.or_eq("flight_id", String.valueOf(flightTickets.getFlightId())));
			}else {
				assist=null;
			}
			if (null!=flightTickets.getFlightDate()) {
				assist.setRequires(Assist.or_eq("flight_date", String.valueOf(flightTickets.getFlightDate())));
			}else {
				assist=null;
			}
			if (null!=flightTickets.getSellCompany()) {
				assist.setRequires(Assist.or_eq("sell_company", String.valueOf(flightTickets.getSellCompany())));
			}
		return null==assist?flightTicketsService.selectFlightTickets(null):flightTicketsService.selectFlightTickets(assist);
	}
	
	@RequestMapping("/findticket/{id}")
	public FlightTickets findTicket(@PathVariable("id") Integer id){
		Assist assist=new Assist();
		return flightTicketsService.selectFlightTicketsById(id);
	}
}
