/**
 * WeatherServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.weather.service;

public class WeatherServiceLocator extends org.apache.axis.client.Service implements com.weather.service.WeatherService {

    public WeatherServiceLocator() {
    }


    public WeatherServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherServiceHttpSoap11Endpoint
    private java.lang.String WeatherServiceHttpSoap11Endpoint_address = "http://localhost:8080/WeatherWebService/services/WeatherService.WeatherServiceHttpSoap11Endpoint/";

    public java.lang.String getWeatherServiceHttpSoap11EndpointAddress() {
        return WeatherServiceHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherServiceHttpSoap11EndpointWSDDServiceName = "WeatherServiceHttpSoap11Endpoint";

    public java.lang.String getWeatherServiceHttpSoap11EndpointWSDDServiceName() {
        return WeatherServiceHttpSoap11EndpointWSDDServiceName;
    }

    public void setWeatherServiceHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        WeatherServiceHttpSoap11EndpointWSDDServiceName = name;
    }

    public com.weather.service.WeatherServicePortType getWeatherServiceHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherServiceHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherServiceHttpSoap11Endpoint(endpoint);
    }

    public com.weather.service.WeatherServicePortType getWeatherServiceHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.weather.service.WeatherServiceSoap11BindingStub _stub = new com.weather.service.WeatherServiceSoap11BindingStub(portAddress, this);
            _stub.setPortName(getWeatherServiceHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherServiceHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        WeatherServiceHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.weather.service.WeatherServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.weather.service.WeatherServiceSoap11BindingStub _stub = new com.weather.service.WeatherServiceSoap11BindingStub(new java.net.URL(WeatherServiceHttpSoap11Endpoint_address), this);
                _stub.setPortName(getWeatherServiceHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WeatherServiceHttpSoap11Endpoint".equals(inputPortName)) {
            return getWeatherServiceHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.weather.com", "WeatherService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.weather.com", "WeatherServiceHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherServiceHttpSoap11Endpoint".equals(portName)) {
            setWeatherServiceHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
