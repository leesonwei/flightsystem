package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Flights;
import com.service.FlightsService;
import com.service.Impl.FlightsServiceImpl;

public class flights {

/*	//@Test
	public void test() throws ParseException {
		ApplicationContext atxContext=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		FlightsService flightsService=atxContext.getBean("flightsService",FlightsServiceImpl.class);
		List<Flights> flights=flightsService.selectFlights(null);
		for (Flights flights2 : flights) {
			System.out.println(flights2.getAirline());
		}
	}
	
	//@Test
	public void test2() throws ParseException {
		ApplicationContext atxContext=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		FlightsService flightsService=atxContext.getBean("flightsService",FlightsServiceImpl.class);
		Flights flights=new Flights();
		flights.setFlightCode("CZ4051");
		flights.setAirline("南方航空");
		flights.setFlightDate(new SimpleDateFormat("yyyy-MM-dd").parse("2014-03-18"));
		flights.setType("空客330(宽体机)");
		flights.setFlightTime("6小时30分钟");
		flights.setTakeAirportId(1);
		flights.setLandingAirportId(2);
		flights.setTakeTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-03-18 01:30:00"));
		flights.setLandingTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2014-03-18 08:00:00"));
		flights.setReferencePrice(1840.00);
		flights.setStopAirport("");
		flightsService.insertFlights(flights);
		System.out.println(flights.getId());
	}
*/
}
