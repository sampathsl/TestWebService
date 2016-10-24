package test;

import java.rmi.RemoteException;

import com.weather.service.WeatherServicePortType;
import com.weather.service.WeatherServicePortTypeProxy;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		WeatherServicePortType ws = new WeatherServicePortTypeProxy().getWeatherServicePortType();
		
		// System.out.println(ws.getMinutelyWeatherReportByLocation("50.115", "145.2626"));
		
		// System.out.println(ws.getHourlyWeatherReportByLocation("50.115", "145.2626"));
		
		// System.out.println(ws.getDailyWeatherReportByLocation("50.115", "145.2626"));
		
		// System.out.println(ws.getCurrentWeatherForcastByLocation("50.115", "145.2626"));
		
		// System.out.println(ws.getFlagWeatherReportByLocation("50.115", "145.2626"));
		
	}

}
