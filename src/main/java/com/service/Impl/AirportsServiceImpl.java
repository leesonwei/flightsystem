package com.service.Impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AirportsMapper;
import com.dao.FlightTicketsMapper;
import com.dao.FlightsMapper;
import com.entity.Airports;
import com.entity.Flights;
import com.common.Assist;
import com.service.AirportsService;
import com.service.FlightsService;

@Service("airportService")
public class AirportsServiceImpl implements AirportsService{   
    @Autowired
	private AirportsMapper airportsMapper;
    @Autowired
	private FlightsService flightsService;
    
    @Override
    public long getAirportsRowCount(Assist assist){
        return airportsMapper.getAirportsRowCount(assist);
    }
    @Override
    public List<Airports> selectAirports(Assist assist){
        return airportsMapper.selectAirports(assist);
    }
    @Override
    public Airports selectAirportsById(Integer id){
        return airportsMapper.selectAirportsById(id);
    }
    @Override
    public int insertAirports(Airports value){
        return airportsMapper.insertAirports(value);
    }
    @Override
    public int insertNonEmptyAirports(Airports value){
        return airportsMapper.insertNonEmptyAirports(value);
    }
    @Override
    public int deleteAirportsById(Integer id){
        return airportsMapper.deleteAirportsById(id);
    }
    @Override
    public int deleteAirports(Assist assist){
        return airportsMapper.deleteAirports(assist);
    }
    @Override
    public int updateAirportsById(Airports enti){
        return airportsMapper.updateAirportsById(enti);
    }
    @Override
    public int updateAirports(Airports value, Assist assist){
        return airportsMapper.updateAirports(value,assist);
    }
    @Override
    public int updateNonEmptyAirportsById(Airports enti){
        return airportsMapper.updateNonEmptyAirportsById(enti);
    }
    @Override
    public int updateNonEmptyAirports(Airports value, Assist assist){
        return airportsMapper.updateNonEmptyAirports(value,assist);
    }

    public AirportsMapper getAirportsMapper() {
        return this.airportsMapper;
    }

    public void setAirportsMapper(AirportsMapper airportsMapper) {
        this.airportsMapper = airportsMapper;
    }
    
	@Override
	public List<Airports> selectAirportsAllInfo(Assist assist) {
		List<Airports> list=new ArrayList<Airports>();
		List<Airports> airports=airportsMapper.selectAirports(assist);
		Assist assist2=new Assist();
		for (Airports airports2 : airports) {
			assist2.setRequires(Assist.and_eq("takeAirport_Id", String.valueOf(airports2.getId())));
			assist2.setRequires(Assist.or_eq("landingAirpor_tId", String.valueOf(airports2.getId())));
			List<Flights> flightList=flightsService.selectFlights(assist2);
			airports2.setFlights(flightList);
			list.add(airports2);
		}
		return list;
	}
	@Override
	public Airports selectAirportsByIdAllInfo(Integer id) {
		Airports airports=airportsMapper.selectAirportsById(id);
		Assist assist2=new Assist();
		assist2.setRequires(Assist.and_eq("takeAirport_Id", String.valueOf(airports.getId())));
		assist2.setRequires(Assist.or_eq("landingAirpor_tId", String.valueOf(airports.getId())));
		List<Flights> flightList=flightsService.selectFlights(assist2);
		airports.setFlights(flightList);
		
		return airports;
	}

}