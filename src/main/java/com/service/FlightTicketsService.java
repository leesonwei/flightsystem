package com.service;
import java.util.List;
import com.entity.FlightTickets;
import com.common.Assist;
public interface FlightTicketsService{
    long getFlightTicketsRowCount(Assist assist);
    List<FlightTickets> selectFlightTickets(Assist assist);
    FlightTickets selectFlightTicketsById(Integer id);
    //service method
    List<FlightTickets> selectFlightTicketsAllInfo(Assist assist);
    FlightTickets selectFlightTicketsByIdAllInfo(Integer id);
    
    int insertFlightTickets(FlightTickets value);
    int insertNonEmptyFlightTickets(FlightTickets value);
    int deleteFlightTicketsById(Integer id);
    int deleteFlightTickets(Assist assist);
    int updateFlightTicketsById(FlightTickets enti);
    int updateFlightTickets(FlightTickets value, Assist assist);
    int updateNonEmptyFlightTicketsById(FlightTickets enti);
    int updateNonEmptyFlightTickets(FlightTickets value, Assist assist);
}