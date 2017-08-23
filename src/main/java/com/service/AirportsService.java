package com.service;
import java.util.List;
import com.entity.Airports;
import com.common.Assist;
public interface AirportsService{
    long getAirportsRowCount(Assist assist);
    List<Airports> selectAirports(Assist assist);
    Airports selectAirportsById(Integer id);
    //service method
    List<Airports> selectAirportsAllInfo(Assist assist);
    Airports selectAirportsByIdAllInfo(Integer id);
    
    int insertAirports(Airports value);
    int insertNonEmptyAirports(Airports value);
    int deleteAirportsById(Integer id);
    int deleteAirports(Assist assist);
    int updateAirportsById(Airports enti);
    int updateAirports(Airports value, Assist assist);
    int updateNonEmptyAirportsById(Airports enti);
    int updateNonEmptyAirports(Airports value, Assist assist);
}