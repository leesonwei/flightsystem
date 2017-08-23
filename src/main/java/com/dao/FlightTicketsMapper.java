package com.dao;
import com.entity.FlightTickets;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightTicketsMapper{
    long getFlightTicketsRowCount(Assist assist);
    List<FlightTickets> selectFlightTickets(Assist assist);
    FlightTickets selectFlightTicketsById(Integer id);
    int insertFlightTickets(FlightTickets value);
    int insertNonEmptyFlightTickets(FlightTickets value);
    int deleteFlightTicketsById(Integer id);
    int deleteFlightTickets(Assist assist);
    int updateFlightTicketsById(FlightTickets enti);
    int updateFlightTickets(@Param("enti") FlightTickets value, @Param("assist") Assist assist);
    int updateNonEmptyFlightTicketsById(FlightTickets enti);
    int updateNonEmptyFlightTickets(@Param("enti") FlightTickets value, @Param("assist") Assist assist);
}