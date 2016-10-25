package test;

import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.weather.service.Currently;
import com.weather.service.Daily;
import com.weather.service.Data;
import com.weather.service.Flags;
import com.weather.service.Hourly;
import com.weather.service.Weather;
import com.weather.service.WeatherServicePortType;
import com.weather.service.WeatherServicePortTypeProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Main main = new Main();
		WeatherServicePortType ws = new WeatherServicePortTypeProxy().getWeatherServicePortType();
		
		// System.out.println(ws.getMinutelyWeatherReportByLocation("50.115", "145.2626"));
		// System.out.println(ws.getHourlyWeatherReportByLocation("50.115", "145.2626"));
		// System.out.println(ws.getDailyWeatherReportByLocation("50.115", "145.2626"));
		// System.out.println(ws.getCurrentWeatherForcastByLocation("50.115", "145.2626"));
		// System.out.println(ws.getFlagWeatherReportByLocation("50.115", "145.2626"));
		
		// how to use the web service which return XML with data
		// now use the XSD generated beans
		
		String currentWeatherForcastByLocation = ws.getCurrentWeatherForcastByLocation("50.115", "145.2626");
		
		String hourlyWeatherReportByLocation = ws.getHourlyWeatherReportByLocation("50.115", "145.2626");
		
		String dailyWeatherReportByLocation = ws.getDailyWeatherReportByLocation("50.115", "145.2626");
		
		String minutelyWeatherReportByLocation = ws.getMinutelyWeatherReportByLocation("50.115", "145.2626");
		
		String flagWeatherReportByLocation = ws.getFlagWeatherReportByLocation("50.115", "145.2626");
		
		// unmarshalling the XMLs
		
		Weather currentWeather = main.getWeatherForcastFromXml(currentWeatherForcastByLocation);
		
		Weather hourlyWeather = main.getWeatherForcastFromXml(hourlyWeatherReportByLocation);
		
		Weather dailyWeather = main.getWeatherForcastFromXml(dailyWeatherReportByLocation);
		
		Weather flagWeather = main.getWeatherForcastFromXml(flagWeatherReportByLocation);
		
		// use the JAXB beans
		
		Currently Currenty = currentWeather.getCurrently();
		System.out.println("getPrecipIntensity : " + Currenty.getPrecipIntensity());
		System.out.println("getSummary : " + Currenty.getSummary());
		System.out.println("getPressure : " + Currenty.getPressure());
		System.out.println("getTemperature : " + Currenty.getTemperature());
		
		System.out.println("\n");
		
		Hourly hourly = hourlyWeather.getHourly();
		List<Data> dataList = hourly.getData();
		for (int i = 0; i < dataList.size() ; i++) {
			System.out.println("getApparentTemperatureMaxTime : " + dataList.get(i).getApparentTemperatureMaxTime());
			System.out.println("getApparentTemperatureMinTime : " + dataList.get(i).getApparentTemperatureMinTime());
			System.out.println("getApparentTemperatureOrCloudCoverOrDewPoint : " + dataList.get(i).getApparentTemperatureOrCloudCoverOrDewPoint());
			System.out.println("getPrecipIntensityMaxTime : " + dataList.get(i).getPrecipIntensityMaxTime());
			System.out.println("getTemperatureMax : " + dataList.get(i).getTemperatureMax());
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		Daily daily = dailyWeather.getDaily();
		dataList = daily.getData();
		
		for (int i = 0; i < dataList.size() ; i++) {
			System.out.println("getApparentTemperatureMaxTime : " + dataList.get(i).getApparentTemperatureMaxTime());
			System.out.println("getApparentTemperatureMinTime : " + dataList.get(i).getApparentTemperatureMinTime());
			System.out.println("getPrecipIntensityMaxTime : " + dataList.get(i).getPrecipIntensityMaxTime());
			System.out.println("getTemperatureMax : " + dataList.get(i).getTemperatureMax());
			System.out.println("\n");
		}
		
		System.out.println("\n");
		
		Flags flags = flagWeather.getFlags();
		List<String> stations = flags.getIsdStations();
		
		for (int i = 0; i < stations.size() ; i++) {
			System.out.println("stations : " + stations.get(i));
		}
		
		System.out.println("\n");
		
		List<String> sources = flags.getSources();
		
		for (int i = 0; i < sources.size() ; i++) {
			System.out.println("sources : " + sources.get(i));
		}
		
		System.out.println("\n");
		
		String units = flags.getUnits();
		System.out.println("units : " + units);
		
	}
	
	/*
	 * use http://www.javatpoint.com/jaxb-unmarshalling-example
	 * Convert weather XML to Java beans
	 */
	private Weather getWeatherForcastFromXml(String xml){
		
		Weather weather = new Weather();
		
		try 
		{
		   StringReader reader = new StringReader(xml);
		   JAXBContext jaxbContext = JAXBContext.newInstance(Weather.class);
		   Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		   weather = (Weather) jaxbUnmarshaller.unmarshal(reader);	
		} 
		catch (Exception e) 
		{
		  e.printStackTrace();
		}
		  
		return weather;
		
	}

}
