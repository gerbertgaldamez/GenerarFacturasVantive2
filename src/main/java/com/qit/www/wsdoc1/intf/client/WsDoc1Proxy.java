package com.qit.www.wsdoc1.intf.client;

public class WsDoc1Proxy implements com.qit.www.wsdoc1.intf.client.WsDoc1 {
  private String _endpoint = null;
  private com.qit.www.wsdoc1.intf.client.WsDoc1 wsDoc1 = null;
  
  public WsDoc1Proxy() {
    _initWsDoc1Proxy();
  }
  
  public WsDoc1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDoc1Proxy();
  }
  
  private void _initWsDoc1Proxy() {
    try {
      wsDoc1 = (new com.qit.www.wsdoc1.intf.client.WsDoc1ServiceLocator()).getWsDoc1Soap11();
      if (wsDoc1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsDoc1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsDoc1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsDoc1 != null)
      ((javax.xml.rpc.Stub)wsDoc1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.qit.www.wsdoc1.intf.client.WsDoc1 getWsDoc1() {
    if (wsDoc1 == null)
      _initWsDoc1Proxy();
    return wsDoc1;
  }
  
  public com.qit.www.wsdoc1.intf.client.WsCreateBillResponse wsCreateBill(com.qit.www.wsdoc1.intf.client.WsCreateBillRequest wsCreateBillRequest) throws java.rmi.RemoteException{
    if (wsDoc1 == null)
      _initWsDoc1Proxy();
    return wsDoc1.wsCreateBill(wsCreateBillRequest);
  }
  
  
}