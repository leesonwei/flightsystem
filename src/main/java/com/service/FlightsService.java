package com.service;
import java.util.List;
import com.entity.Flights;
import com.common.Assist;
public interface FlightsService{
    long getFlightsRowCount(Assist assist);
    List<Flights> selectFlights(Assist assist);
    Flights selectFlightsById(Integer id);
    //service mothods
    Flights selectFlightsByIdAllInfo(Integer id);
    
    int insertFlights(Flights value);
    int insertNonEmptyFlights(Flights value);
    int deleteFlightsById(Integer id);
    int deleteFlights(Assist assist);
    int updateFlightsById(Flights enti);
    int updateFlights(Flights value, Assist assist);
    int updateNonEmptyFlightsById(Flights enti);
    int updateNonEmptyFlights(Flights value, Assist assist);
	List<Flights> selectFlightsAllInfo(Flights flightsp);
}