package com.weather.service;

public class WeatherServicePortTypeProxy implements com.weather.service.WeatherServicePortType {
  private String _endpoint = null;
  private com.weather.service.WeatherServicePortType weatherServicePortType = null;
  
  public WeatherServicePortTypeProxy() {
    _initWeatherServicePortTypeProxy();
  }
  
  public WeatherServicePortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherServicePortTypeProxy();
  }
  
  private void _initWeatherServicePortTypeProxy() {
    try {
      weatherServicePortType = (new com.weather.service.WeatherServiceLocator()).getWeatherServiceHttpSoap11Endpoint();
      if (weatherServicePortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weatherServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weatherServicePortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weatherServicePortType != null)
      ((javax.xml.rpc.Stub)weatherServicePortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.weather.service.WeatherServicePortType getWeatherServicePortType() {
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType;
  }
  
  public java.lang.String getHourlyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getHourlyWeatherReportByLocation(latitude, longitude);
  }
  
  public java.lang.String getMinutelyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getMinutelyWeatherReportByLocation(latitude, longitude);
  }
  
  public java.lang.String getCurrentWeatherForcastByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getCurrentWeatherForcastByLocation(latitude, longitude);
  }
  
  public java.lang.String getAlertWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getAlertWeatherReportByLocation(latitude, longitude);
  }
  
  public java.lang.String getDailyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getDailyWeatherReportByLocation(latitude, longitude);
  }
  
  public java.lang.String getFlagWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException{
    if (weatherServicePortType == null)
      _initWeatherServicePortTypeProxy();
    return weatherServicePortType.getFlagWeatherReportByLocation(latitude, longitude);
  }
  
  
}