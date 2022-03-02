/**
 * WsCreateBillResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.qit.www.wsdoc1.intf.client;

public class WsCreateBillResponse  implements java.io.Serializable {
    private java.lang.String mensaje;

    private java.lang.String ruta_pdf;

    public WsCreateBillResponse() {
    }

    public WsCreateBillResponse(
           java.lang.String mensaje,
           java.lang.String ruta_pdf) {
           this.mensaje = mensaje;
           this.ruta_pdf = ruta_pdf;
    }


    /**
     * Gets the mensaje value for this WsCreateBillResponse.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this WsCreateBillResponse.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the ruta_pdf value for this WsCreateBillResponse.
     * 
     * @return ruta_pdf
     */
    public java.lang.String getRuta_pdf() {
        return ruta_pdf;
    }


    /**
     * Sets the ruta_pdf value for this WsCreateBillResponse.
     * 
     * @param ruta_pdf
     */
    public void setRuta_pdf(java.lang.String ruta_pdf) {
        this.ruta_pdf = ruta_pdf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCreateBillResponse)) return false;
        WsCreateBillResponse other = (WsCreateBillResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.ruta_pdf==null && other.getRuta_pdf()==null) || 
             (this.ruta_pdf!=null &&
              this.ruta_pdf.equals(other.getRuta_pdf())));
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
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getRuta_pdf() != null) {
            _hashCode += getRuta_pdf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsCreateBillResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", ">WsCreateBillResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruta_pdf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.qit.com/wsdoc1/intf/client", "ruta_pdf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
