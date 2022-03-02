/**
 * WsDoc1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.qit.www.wsdoc1.intf.client;

public class WsDoc1ServiceLocator extends org.apache.axis.client.Service implements com.qit.www.wsdoc1.intf.client.WsDoc1Service {

    public WsDoc1ServiceLocator() {
    }


    public WsDoc1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsDoc1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsDoc1Soap11
    private java.lang.String WsDoc1Soap11_address = "http://10.231.128.122:7003/wsdoc1/";

    public java.lang.String getWsDoc1Soap11Address() {
        return WsDoc1Soap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsDoc1Soap11WSDDServiceName = "WsDoc1Soap11";

    public java.lang.String getWsDoc1Soap11WSDDServiceName() {
        return WsDoc1Soap11WSDDServiceName;
    }

    public void setWsDoc1Soap11WSDDServiceName(java.lang.String name) {
        WsDoc1Soap11WSDDServiceName = name;
    }

    public com.qit.www.wsdoc1.intf.client.WsDoc1 getWsDoc1Soap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsDoc1Soap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsDoc1Soap11(endpoint);
    }

    public com.qit.www.wsdoc1.intf.client.WsDoc1 getWsDoc1Soap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.qit.www.wsdoc1.intf.client.WsDoc1Soap11Stub _stub = new com.qit.www.wsdoc1.intf.client.WsDoc1Soap11Stub(portAddress, this);
            _stub.setPortName(getWsDoc1Soap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsDoc1Soap11EndpointAddress(java.lang.String address) {
        WsDoc1Soap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.qit.www.wsdoc1.intf.client.WsDoc1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.qit.www.wsdoc1.intf.client.WsDoc1Soap11Stub _stub = new com.qit.www.wsdoc1.intf.client.WsDoc1Soap11Stub(new java.net.URL(WsDoc1Soap11_address), this);
                _stub.setPortName(getWsDoc1Soap11WSDDServiceName());
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
        if ("WsDoc1Soap11".equals(inputPortName)) {
            return getWsDoc1Soap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", "WsDoc1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", "WsDoc1Soap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsDoc1Soap11".equals(portName)) {
            setWsDoc1Soap11EndpointAddress(address);
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
