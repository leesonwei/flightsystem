package com.dao;
import com.entity.Flights;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightsMapper{
    long getFlightsRowCount(Assist assist);
    List<Flights> selectFlights(Assist assist);
    Flights selectFlightsById(Integer id);
    int insertFlights(Flights value);
    int insertNonEmptyFlights(Flights value);
    int deleteFlightsById(Integer id);
    int deleteFlights(Assist assist);
    int updateFlightsById(Flights enti);
    int updateFlights(@Param("enti") Flights value, @Param("assist") Assist assist);
    int updateNonEmptyFlightsById(Flights enti);
    int updateNonEmptyFlights(@Param("enti") Flights value, @Param("assist") Assist assist);
	List<Flights> selectFlightsAllInfo(Flights flights);
}