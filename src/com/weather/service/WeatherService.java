/**
 * WeatherService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.weather.service;

public interface WeatherService extends javax.xml.rpc.Service {
    public java.lang.String getWeatherServiceHttpSoap11EndpointAddress();

    public com.weather.service.WeatherServicePortType getWeatherServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException;

    public com.weather.service.WeatherServicePortType getWeatherServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
