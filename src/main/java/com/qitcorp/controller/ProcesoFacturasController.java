package com.qitcorp.controller;

import java.net.MalformedURLException;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.List;
import org.apache.axis.AxisFault;
import org.apache.log4j.Logger;

import com.qit.www.wsdoc1.intf.client.WsCreateBillRequest;
import com.qit.www.wsdoc1.intf.client.WsCreateBillResponse;
import com.qit.www.wsdoc1.intf.client.WsDoc1;
import com.qit.www.wsdoc1.intf.client.WsDoc1Service;
import com.qit.www.wsdoc1.intf.client.WsDoc1ServiceLocator;
import com.qit.www.wsdoc1.intf.client.WsDoc1Soap11Stub;
import com.qitcorp.dao.ProcesoFacturasDao;

import com.qitcorp.model.TcFacturasVantiveModel;

public class ProcesoFacturasController {

	private static final Logger logger = Logger.getLogger("log4j.properties");

	public ProcesoFacturasController(){
		logger.info("Ingresa a constructor de ProcesoFacturasController");
	}

	public void startProcessFactura() {
		ProcesoFacturasDao objDao = new ProcesoFacturasDao();

		logger.debug("Antes de obtener la lista en metodo obtenerFacturasVantive");
		List<TcFacturasVantiveModel> list = objDao.obtenerFacturasVantive();
		logger.info("Obtiene lista de vista => "+list.size());
		if (list != null && list.size() > 0) {
			List<TcFacturasVantiveModel> parametros = ProcesoFacturasDao.obtenerParametrosWS();
			Iterator<TcFacturasVantiveModel> iterator = list.iterator();
			while (iterator.hasNext()) {
				TcFacturasVantiveModel facturas = iterator.next();
				//boolean response = procesaWSFacturasVantine(parametros, facturas);
				/*logger.debug("startProcessFactura-llama al metodo procesaWSFacturasVantine");
				procesaWSFacturasVantine(parametros, facturas);*/
				WsCreateBillResponse response = requestWsFacturasVantive(parametros, facturas);
				logger.info("OBJETO FACTURAS: " + facturas.getBillRefNo());
				logger.info("Resultado de consumo: "+response.getMensaje());
			}
		} else {
			logger.warn("Lista de la vista vacia");
		}

	}
	 
		/*public boolean procesaWSFacturasVantine(List<TcFacturasVantiveModel> parametros,
				TcFacturasVantiveModel facturas) {
			logger.debug("procesaWSFacturasVantine - inicio");			
			boolean result = ProcesoFacturasDao.ejecutaFacturasSP(facturas.getTcFacturasCabId(), facturas.getBatchSize(), facturas.getOutBatchSize(), facturas.getStatus(), facturas.getRespuesta());
			logger.info("[ProcesoFacturas] Ejecuta SP para id => "+ facturas.getTcFacturasCabId() + " Resultado => " + result);

			return result;
		}
		*/
		
		public WsCreateBillResponse requestWsFacturasVantive(List<TcFacturasVantiveModel> parametros,TcFacturasVantiveModel facturas ) {
			WsDoc1Service servicio = new WsDoc1ServiceLocator();
			WsDoc1 wsExec;

			try {
				wsExec = new WsDoc1Soap11Stub(new URL(servicio.getWsDoc1Soap11Address()), servicio);

				//int BILL_REF_NO = facturas.getTCFACTURASCABID();
				WsCreateBillRequest request = new WsCreateBillRequest();
				request.setBill_ref_no(facturas.getBillRefNo());
				
				logger.info("Parametro request: "+facturas.getBillRefNo());
				
				WsCreateBillResponse response = wsExec.wsCreateBill(request);

				logger.info("Respuesta de WS facturas: "+response.getRuta_pdf());

				return response;
			} catch (AxisFault e) {
				logger.error(e);
			} catch (MalformedURLException e) {
				logger.error(e);
			} catch (RemoteException e) {
				logger.error(e);
			}
			
			return null;
		}
		

}
