package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.common.Assist;
import com.entity.Airports;
import com.service.AirportsService;

@RestController
public class AirportsController {
	@Autowired
	private AirportsService airportsService;
	
	@RequestMapping("/findairports")
	public List<Airports> findAirports(Airports airports){
		Assist assist=new Assist();
		if(null!=airports.getAirportName()){
			assist.setRequires(Assist.and_eq("airport_name", airports.getAirportName()));
		}
		if(null!=airports.getCityName()){
			assist.setRequires(Assist.and_eq("city_name", airports.getCityName()));
		}
		return airportsService.selectAirports(assist);
	}
	
	@RequestMapping("/findairport/{id}")
	public Airports findAirports(@PathVariable("id") Integer id){
		return airportsService.selectAirportsById(id);
	}
	
	@RequestMapping("/findairportbyname/{cityName}")
	public List<Airports> findAirports(@PathVariable("cityName") String cityName){
		Assist assist=new Assist();
		assist.setRequires(Assist.and_eq("city_name", cityName));
		return airportsService.selectAirports(assist);
	}

}
