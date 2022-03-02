/**
 * WsCreateBillRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.qit.www.wsdoc1.intf.client;

public class WsCreateBillRequest  implements java.io.Serializable {
    private int bill_ref_no;

    public WsCreateBillRequest() {
    }

    public WsCreateBillRequest(
           int bill_ref_no) {
           this.bill_ref_no = bill_ref_no;
    }


    /**
     * Gets the bill_ref_no value for this WsCreateBillRequest.
     * 
     * @return bill_ref_no
     */
    public int getBill_ref_no() {
        return bill_ref_no;
    }


    /**
     * Sets the bill_ref_no value for this WsCreateBillRequest.
     * 
     * @param bill_ref_no
     */
    public void setBill_ref_no(int bill_ref_no) {
        this.bill_ref_no = bill_ref_no;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCreateBillRequest)) return false;
        WsCreateBillRequest other = (WsCreateBillRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.bill_ref_no == other.getBill_ref_no();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getBill_ref_no();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsCreateBillRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", ">WsCreateBillRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bill_ref_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", "bill_ref_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
