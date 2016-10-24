/**
 * WeatherServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.weather.service;

public interface WeatherServicePortType extends java.rmi.Remote {
    public java.lang.String getHourlyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String getMinutelyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String getCurrentWeatherForcastByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String getAlertWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String getDailyWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
    public java.lang.String getFlagWeatherReportByLocation(java.lang.String latitude, java.lang.String longitude) throws java.rmi.RemoteException;
}
