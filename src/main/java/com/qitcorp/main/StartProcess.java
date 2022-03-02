package com.qitcorp.main;

import org.apache.log4j.Logger;

import com.qitcorp.controller.ProcesoFacturasController;



public class StartProcess {
	
	private static final Logger logger = Logger.getLogger("log4j.properties");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("********************* INICIA PROCESO ***********************");
		ProcesoFacturasController objProceso = new ProcesoFacturasController();
		objProceso.startProcessFactura();
		//objProceso.requestWsFacturasVantive(null, null);
		logger.info("********************* FINALIZA PROCESO ***********************");
	}

}
