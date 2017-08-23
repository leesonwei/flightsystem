package com.service.Impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AirportsMapper;
import com.dao.FlightTicketsMapper;
import com.dao.FlightsMapper;
import com.entity.Airports;
import com.entity.FlightTickets;
import com.entity.Flights;
import com.common.Assist;
import com.service.AirportsService;
import com.service.FlightTicketsService;
import com.service.FlightsService;

@Service("flightsService")
public class FlightsServiceImpl implements FlightsService{
	@Autowired
	private FlightTicketsService flightTicketsService;
    @Autowired
	private AirportsService airportsService;
    @Autowired
	private FlightsMapper flightsMapper;
    
    @Override
    public long getFlightsRowCount(Assist assist){
        return flightsMapper.getFlightsRowCount(assist);
    }
    @Override
    public List<Flights> selectFlights(Assist assist){
        return flightsMapper.selectFlights(assist);
    }
    @Override
    public Flights selectFlightsById(Integer id){
        return flightsMapper.selectFlightsById(id);
    }
    @Override
    public int insertFlights(Flights value){
        return flightsMapper.insertFlights(value);
    }
    @Override
    public int insertNonEmptyFlights(Flights value){
        return flightsMapper.insertNonEmptyFlights(value);
    }
    @Override
    public int deleteFlightsById(Integer id){
        return flightsMapper.deleteFlightsById(id);
    }
    @Override
    public int deleteFlights(Assist assist){
        return flightsMapper.deleteFlights(assist);
    }
    @Override
    public int updateFlightsById(Flights enti){
        return flightsMapper.updateFlightsById(enti);
    }
    @Override
    public int updateFlights(Flights value, Assist assist){
        return flightsMapper.updateFlights(value,assist);
    }
    @Override
    public int updateNonEmptyFlightsById(Flights enti){
        return flightsMapper.updateNonEmptyFlightsById(enti);
    }
    @Override
    public int updateNonEmptyFlights(Flights value, Assist assist){
        return flightsMapper.updateNonEmptyFlights(value,assist);
    }

    public FlightsMapper getFlightsMapper() {
        return this.flightsMapper;
    }

    public void setFlightsMapper(FlightsMapper flightsMapper) {
        this.flightsMapper = flightsMapper;
    }
	@Override
	public List<Flights> selectFlightsAllInfo(Flights flightsp) {
		List<Flights> list=new ArrayList<Flights>();
		List<Flights> flights=flightsMapper.selectFlightsAllInfo(flightsp);
		Assist assist2=null;
		for (Flights flights2 : flights) {
			assist2=new Assist();
			assist2.setRequires(Assist.and_eq("flight_Id",String.valueOf(flights2.getId())));
			List<FlightTickets> tickets=flightTicketsService.selectFlightTickets(assist2);
			flights2.setFlightTickets(tickets);
			Airports takeAirports=airportsService.selectAirportsById(flights2.getTakeAirportId());
			flights2.setTakeAirports(takeAirports);
			Airports landingAirports=airportsService.selectAirportsById(flights2.getLandingAirportId());
			flights2.setLandingAirports(landingAirports);
			list.add(flights2);
		}
		return list;
	}
	
	@Override
	public Flights selectFlightsByIdAllInfo(Integer id) {
		Flights flights=flightsMapper.selectFlightsById(id);
		Assist assist=new Assist();
		assist.setRequires(Assist.and_eq("flight_Id", String.valueOf(flights.getId())));
		flights.setTakeAirports(airportsService.selectAirportsById(flights.getTakeAirportId()));
		flights.setLandingAirports(airportsService.selectAirportsById(flights.getLandingAirportId()));
		return flights;
	}

}