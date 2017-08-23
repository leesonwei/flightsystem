package com.dao;
import com.entity.Airports;
import java.util.List;
import com.common.Assist;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportsMapper{
    long getAirportsRowCount(Assist assist);
    List<Airports> selectAirports(Assist assist);
    Airports selectAirportsById(Integer id);
    int insertAirports(Airports value);
    int insertNonEmptyAirports(Airports value);
    int deleteAirportsById(Integer id);
    int deleteAirports(Assist assist);
    int updateAirportsById(Airports enti);
    int updateAirports(@Param("enti") Airports value, @Param("assist") Assist assist);
    int updateNonEmptyAirportsById(Airports enti);
    int updateNonEmptyAirports(@Param("enti") Airports value, @Param("assist") Assist assist);
}