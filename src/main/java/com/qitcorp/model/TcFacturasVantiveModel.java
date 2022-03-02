package com.qitcorp.model;

public class TcFacturasVantiveModel {
	 public final static String VIEW = "TC_FACTURAS_VANTIVE_VW"; 
	public final static String FIELD_TCFACTURASCABID = "TCFACTURASCABID";
	
	public final static String FIELD_SERIE_FAC = "SERIE_FAC";
	public final static String FIELD_NO_FAC ="NO_FAC";
	public final static String FIELD_ACCOUNT_NO ="ACCOUNT_NO";
	public final static String FIELD_TECUENTAID ="TECUENTAID";
	public final static String FIELD_SWCUSTOMERID ="SWCUSTOMERID";
	public final static String FIELD_FECHA_EMISION ="FECHA_EMISION";
	public final static String FIELD_USUARIO_EMISION ="USUARIO_EMISION";
	public final static String FIELD_ESTADO ="ESTADO";
	public final static String FIELD_NIT ="NIT";
	public final static String FIELD_NOMBRE ="NOMBRE";
	public final static String FIELD_DIRECCION ="DIRECCION";
	public final static String FIELD_TIPO_FAC ="TIPO_FAC";
	public final static String FIELD_TIPO_PAGO ="TIPO_PAGO";
	public final static String FIELD_EMISOR_PAGO ="EMISOR_PAGO";
	public final static String FIELD_ID_PAGO ="ID_PAGO";
	public final static String FIELD_REFERENCIA_PAGO ="REFERENCIA_PAGO";
	public final static String FIELD_MONTO_PAGADO ="MONTO_PAGADO";
	public final static String FIELD_MONTO_FACTURA ="MONTO_FACTURA";
	public final static String FIELD_SWDATECREATED ="SWDATECREATED";
	public final static String FIELD_SWCREATEDBY ="SWCREATEDBY";
	public final static String FIELD_TIMESTAMP ="TIMESTAMP";
	public final static String FIELD_COD_ELEMENTOID ="COD_ELEMENTOID";
	public final static String FIELD_TENUMSCONTRID ="TENUMSCONTRID";
	public final static String FIELD_BILL_REF_NO = "BILL_REF_NO";
	public final static String FIELD_BILL_REF_RESETS ="BILL_REF_RESETS";
	public final static String FIELD_ID_RELACIONADO ="ID_RELACIONADO";
	public final static String FIELD_TIPO_ID_RELACIONADO ="TIPO_ID_RELACIONADO";
	public final static String FIELD_INTENTOS ="INTENTOS";
	public final static String FIELD_DEPARTAMENTO ="DEPARTAMENTO";
	public final static String FIELD_MUNICIPIO ="MUNICIPIO";
	public final static String FIELD_FEC_VENCIMIENTO ="FEC_VENCIMIENTO";
	public final static String FIELD_TCGFACTURAID ="TCGFACTURAID";
	public final static String FIELD_TCCORTECAJAID ="TCCORTECAJAID";
	public final static String FIELD_TESALMACENESINVID ="TESALMACENESINVID";
	public final static String FIELD_DISTRIBUIDOR ="DISTRIBUIDOR";
	public final static String FIELD_PUNTO_VENTA ="PUNTO_VENTA";
	public final static String FIELD_VENDEDOR ="VENDEDOR";
	public final static String FIELD_DES_ESTATUSTRIB ="DES_ESTATUSTRIB";
	public final static String FIELD_CREDITO_FISCAL ="CREDITO_FISCAL";
	public final static String FIELD_GIRO ="GIRO";
	public final static String FIELD_NUMERO_IVA ="NUMERO_IVA";
	public final static String FIELD_DESCUENTO ="DESCUENTO";
	public final static String FIELD_LIQUIDADO_COBROS ="LIQUIDADO_COBROS";
	public final static String FIELD_FECHA_LIQ_COBROS ="FECHA_LIQ_COBROS";
	public final static String FIELD_MONTO_FINAL ="MONTO_FINAL";
	public final static String FIELD_TCRETENCIONID ="TCRETENCIONID";
	public final static String FIELD_VALOR_RETENCION ="VALOR_RETENCION";
	public final static String FIELD_ENVIO_RI ="ENVIO_RI";
	public final static String FIELD_FACTURA_PROCESADA ="FACTURA_PROCESADA";
	public final static String FIELD_CONTRIBUCION_SEG ="CONTRIBUCION_SEG";
	public final static String FIELD_idDoc ="idDoc";
	
	
	
	private int tcFacturasCabId;
	private String serieFac;
	private int noFac;
	private int accountNo;
	private int tecuentaid;
	private int swcustomerid;
	private String fechaEmision;
	private String usuarioEmision;
	private String estado;
	private String nit;
	private String nombre;
	private String direccion;
	private String tipoFac;
	private String tipoPago;
	private String emisorPago;
	private String idPago;
	private String referenciaPago;
	private int montoPagado;
	private int montoFactura;
	private String swdatecreated;
	private String swcreatedby;
	private int timestamp;
	private int codElementoId;
	private int teNumscontrId;
	private int billRefNo;
	private int billRefResets;
	private int idRelacionado;
	private int tipoIdRelacionado;
	private int intentos;
	private String departamento;
	private String municipio;
	private String fecVencimiento;
	private int tcgfacturaid;
	private int tcCorteCajaId ;
	private int tesalmacenesinvid;
	private int distribuidor;
	private int puntoVenta;
	private int vendedor;
	private String desEstatustrib;
	private String creditoFiscal;
	private String giro;
	private String numeroIva;
	private int descuento;
	private String liquidadoCobros;
	private String fechaLiqCobros;
	private int montoFinal;
	private int tcRetencionId;
	private int valorRetencion;
	private int envioRi;
	private int facturaProcesada;
	private int contribucionSeg;
	private double idDoc;
	private String batchSize;
	
	private String outBatchSize; 
	private String status;
	private String respuesta; 
	
	public TcFacturasVantiveModel( int tcfacturascabId, int billRefNo) {
		
		super();
		this.tcFacturasCabId =tcfacturascabId;
		/*this.serieFac =serieFac;
		this.noFac = noFac;
		this.accountNo =account_No;
		this.tecuentaid =tecuentaid;
		this.swcustomerid =swcustomerid;
		this.fechaEmision =fechaEmision;
		this.usuarioEmision =usuarioEmision;
		this.estado =estado;
		this.nit =nit;
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipoFac =tipoFac;
		this.tipoPago = tipoPago;
		this.emisorPago = emisorPago;
		this.idPago = idPago;
		this.referenciaPago = referenciaPago;
		this.montoPagado = montoPagado;
		this.montoFactura = montoFactura;
		this.swdatecreated = swdatecreated;
		this.swcreatedby = swcreatedby;
		this.timestamp = timestamp;
		this.codElementoId = codElementoId;
		this.teNumscontrId = teNumscontrId;*/
		this.billRefNo = billRefNo;
		/*this.billRefResets = billRefResets;
		this.idRelacionado = idRelacionado;
		this.tipoIdRelacionado = tipoIdRelacionado;
		this.intentos = intentos;
		this.departamento = departamento;
		this.municipio = municipio;
		this.fecVencimiento = fecVencimiento;
		this.tcFacturasCabId = tcgFacturaId;
		this.tcCorteCajaId = tcCorteCajaId;
		this.tesalmacenesinvid = tesalmacenesinvid;
		this.distribuidor = distribuidor;
		this.puntoVenta = puntoVenta;
		this.vendedor = vendedor;
		this.desEstatustrib = desEstatustrib;
		this.creditoFiscal = creditoFiscal;
		this.giro =  giro;
		this.numeroIva = numeroIva;
		this.descuento = descuento;
		this.liquidadoCobros = liquidadoCobros;
		this.fechaLiqCobros = fechaLIqCobros;
		this.montoFinal = montoFinal;
		this.tcRetencionId = tcRetencionId;
		this.valorRetencion = valorRetencion;
		this.envioRi = envioRi;
		this.facturaProcesada = facturaProcesada;
		this.contribucionSeg = contribucionSeg;
		this.idDoc = idDoc;*/
	}

	public int getTcFacturasCabId() {
		return tcFacturasCabId;
	}



	public void setTcFacturasCabId(int tcFacturasCabId) {
		this.tcFacturasCabId = tcFacturasCabId;
	}



	public String getSerieFac() {
		return serieFac;
	}



	public void setSerieFac(String serieFac) {
		this.serieFac = serieFac;
	}



	public int getNoFac() {
		return noFac;
	}



	public void setNoFac(int noFac) {
		this.noFac = noFac;
	}



	public int getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}



	public int getTecuentaid() {
		return tecuentaid;
	}



	public void setTecuentaid(int tecuentaid) {
		this.tecuentaid = tecuentaid;
	}



	public int getSwcustomerid() {
		return swcustomerid;
	}



	public void setSwcustomerid(int swcustomerid) {
		this.swcustomerid = swcustomerid;
	}



	public String getFechaEmision() {
		return fechaEmision;
	}



	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}



	public String getUsuarioEmision() {
		return usuarioEmision;
	}



	public void setUsuarioEmision(String usuarioEmision) {
		this.usuarioEmision = usuarioEmision;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public String getNit() {
		return nit;
	}



	public void setNit(String nit) {
		this.nit = nit;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getTipoFac() {
		return tipoFac;
	}



	public void setTipoFac(String tipoFac) {
		this.tipoFac = tipoFac;
	}



	public String getTipoPago() {
		return tipoPago;
	}



	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}



	public String getEmisorPago() {
		return emisorPago;
	}



	public void setEmisorPago(String emisorPago) {
		this.emisorPago = emisorPago;
	}



	public String getIdPago() {
		return idPago;
	}



	public void setIdPago(String idPago) {
		this.idPago = idPago;
	}



	public String getReferenciaPago() {
		return referenciaPago;
	}



	public void setReferenciaPago(String referenciaPago) {
		this.referenciaPago = referenciaPago;
	}



	public int getMontoPagado() {
		return montoPagado;
	}



	public void setMontoPagado(int montoPagado) {
		this.montoPagado = montoPagado;
	}



	public int getMontoFactura() {
		return montoFactura;
	}



	public void setMontoFactura(int montoFactura) {
		this.montoFactura = montoFactura;
	}



	public String getSwdatecreated() {
		return swdatecreated;
	}



	public void setSwdatecreated(String swdatecreated) {
		this.swdatecreated = swdatecreated;
	}



	public String getSwcreatedby() {
		return swcreatedby;
	}



	public void setSwcreatedby(String swcreatedby) {
		this.swcreatedby = swcreatedby;
	}



	public int getTimestamp() {
		return timestamp;
	}



	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}



	public int getCodElementoId() {
		return codElementoId;
	}



	public void setCodElementoId(int codElementoId) {
		this.codElementoId = codElementoId;
	}



	public int getTeumscontrid() {
		return teNumscontrId;
	}



	public void setTeumscontrid(int teumscontrid) {
		this.teNumscontrId = teumscontrid;
	}



	public int getBillRefNo() {
		return billRefNo;
	}



	public void setBillRefNo(int billRefNo) {
		this.billRefNo = billRefNo;
	}



	public int getBillRefResets() {
		return billRefResets;
	}



	public void setBillRefResets(int billRefResets) {
		this.billRefResets = billRefResets;
	}



	public int getIdRelacionado() {
		return idRelacionado;
	}



	public void setIdRelacionado(int idRelacionado) {
		this.idRelacionado = idRelacionado;
	}



	public int getTipoIdRelacionado() {
		return tipoIdRelacionado;
	}



	public void setTipoIdRelacionado(int tipoIdRelacionado) {
		this.tipoIdRelacionado = tipoIdRelacionado;
	}



	public int getIntentos() {
		return intentos;
	}



	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}



	public String getDepartamento() {
		return departamento;
	}



	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getFecVencimiento() {
		return fecVencimiento;
	}



	public void setFecVencimiento(String fecVencimiento) {
		this.fecVencimiento = fecVencimiento;
	}



	public int getTcgfacturaid() {
		return tcgfacturaid;
	}



	public void setTcgfacturaid(int tcgfacturaid) {
		this.tcgfacturaid = tcgfacturaid;
	}



	public int getTccortecajaid() {
		return tcCorteCajaId;
	}



	public void setTccortecajaid(int tccortecajaid) {
		this.tcCorteCajaId = tccortecajaid;
	}



	public int getTesalmacenesinvid() {
		return tesalmacenesinvid;
	}



	public void setTesalmacenesinvid(int tesalmacenesinvid) {
		this.tesalmacenesinvid = tesalmacenesinvid;
	}



	public int getDistribuidor() {
		return distribuidor;
	}



	public void setDistribuidor(int distribuidor) {
		this.distribuidor = distribuidor;
	}



	public int getPuntoVenta() {
		return puntoVenta;
	}



	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}



	public int getVendedor() {
		return vendedor;
	}



	public void setVendedor(int vendedor) {
		this.vendedor = vendedor;
	}



	public String getDesEstatustrib() {
		return desEstatustrib;
	}



	public void setDesEstatustrib(String desEstatustrib) {
		this.desEstatustrib = desEstatustrib;
	}



	public String getCreditoFiscal() {
		return creditoFiscal;
	}



	public void setCreditoFiscal(String creditoFiscal) {
		this.creditoFiscal = creditoFiscal;
	}



	public String getGiro() {
		return giro;
	}



	public void setGiro(String giro) {
		this.giro = giro;
	}



	public String getNumeroIva() {
		return numeroIva;
	}



	public void setNumeroIva(String numeroIva) {
		this.numeroIva = numeroIva;
	}



	public int getDescuento() {
		return descuento;
	}



	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}



	public String getLiquidadoCobros() {
		return liquidadoCobros;
	}



	public void setLiquidadoCobros(String liquidadoCobros) {
		this.liquidadoCobros = liquidadoCobros;
	}



	public String getFechaLiqCobros() {
		return fechaLiqCobros;
	}



	public void setFechaLiqCobros(String fechaLiqCobros) {
		this.fechaLiqCobros = fechaLiqCobros;
	}



	public int getMontoFinal() {
		return montoFinal;
	}



	public void setMontoFinal(int montoFinal) {
		this.montoFinal = montoFinal;
	}



	public int getTcretencionid() {
		return tcRetencionId;
	}



	public void setTcretencionid(int tcretencionid) {
		this.tcRetencionId = tcretencionid;
	}



	public int getValorRetencion() {
		return valorRetencion;
	}



	public void setValorRetencion(int valorRetencion) {
		this.valorRetencion = valorRetencion;
	}



	public int getEnvioRi() {
		return envioRi;
	}



	public void setEnvioRi(int envioRi) {
		this.envioRi = envioRi;
	}



	public int getFacturaProcesada() {
		return facturaProcesada;
	}



	public void setFacturaProcesada(int facturaProcesada) {
		this.facturaProcesada = facturaProcesada;
	}



	public int getContribucionSeg() {
		return contribucionSeg;
	}



	public void setContribucionSeg(int contribucionSeg) {
		this.contribucionSeg = contribucionSeg;
	}
	
	public double getIdDoc() {
		return idDoc;
	}
	public void setIdDoc(double idDoc) {
		this.idDoc = idDoc;
	}
	public String getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(String batchSize) {
		this.batchSize = batchSize;
	}
	public String getOutBatchSize() {
		return outBatchSize;
	}
	public void setOutBatchSize(String outBatchSize) {
		this.outBatchSize = outBatchSize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
}
