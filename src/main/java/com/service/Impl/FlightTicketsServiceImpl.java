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

@Service("flightTicketsService")
public class FlightTicketsServiceImpl implements FlightTicketsService{
    @Autowired
	private FlightTicketsMapper flightTicketsMapper;
    @Autowired
	private FlightsService flightsService;
    
    @Override
    public long getFlightTicketsRowCount(Assist assist){
        return flightTicketsMapper.getFlightTicketsRowCount(assist);
    }
    @Override
    public List<FlightTickets> selectFlightTickets(Assist assist){
        return flightTicketsMapper.selectFlightTickets(assist);
    }
    @Override
    public FlightTickets selectFlightTicketsById(Integer id){
        return flightTicketsMapper.selectFlightTicketsById(id);
    }
    @Override
    public int insertFlightTickets(FlightTickets value){
        return flightTicketsMapper.insertFlightTickets(value);
    }
    @Override
    public int insertNonEmptyFlightTickets(FlightTickets value){
        return flightTicketsMapper.insertNonEmptyFlightTickets(value);
    }
    @Override
    public int deleteFlightTicketsById(Integer id){
        return flightTicketsMapper.deleteFlightTicketsById(id);
    }
    @Override
    public int deleteFlightTickets(Assist assist){
        return flightTicketsMapper.deleteFlightTickets(assist);
    }
    @Override
    public int updateFlightTicketsById(FlightTickets enti){
        return flightTicketsMapper.updateFlightTicketsById(enti);
    }
    @Override
    public int updateFlightTickets(FlightTickets value, Assist assist){
        return flightTicketsMapper.updateFlightTickets(value,assist);
    }
    @Override
    public int updateNonEmptyFlightTicketsById(FlightTickets enti){
        return flightTicketsMapper.updateNonEmptyFlightTicketsById(enti);
    }
    @Override
    public int updateNonEmptyFlightTickets(FlightTickets value, Assist assist){
        return flightTicketsMapper.updateNonEmptyFlightTickets(value,assist);
    }

    public FlightTicketsMapper getFlightTicketsMapper() {
        return this.flightTicketsMapper;
    }

    public void setFlightTicketsMapper(FlightTicketsMapper flightTicketsMapper) {
        this.flightTicketsMapper = flightTicketsMapper;
    }
    
	@Override
	public List<FlightTickets> selectFlightTicketsAllInfo(Assist assist) {
		List<FlightTickets> list=new ArrayList<FlightTickets>();
		List<FlightTickets> flightTickets=flightTicketsMapper.selectFlightTickets(assist);
		for (FlightTickets flightTickets2 : flightTickets) {
			Flights flights=flightsService.selectFlightsByIdAllInfo(flightTickets2.getFlightId());
			flightTickets2.setFlights(flights);
			list.add(flightTickets2);
		}
		return list;
	}
	@Override
	public FlightTickets selectFlightTicketsByIdAllInfo(Integer id) {
		FlightTickets flightTickets=flightTicketsMapper.selectFlightTicketsById(id);
		Flights flights=flightsService.selectFlightsByIdAllInfo(flightTickets.getFlightId());
		flightTickets.setFlights(flights);
		return flightTickets;
	}

}