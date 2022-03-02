package com.qitcorp.util;

import java.util.List;

//import com.qitcorp.model.CBParametrosModel;
import com.qitcorp.model.TcFacturasVantiveModel;

public class Tools {
	
	
	public static final String facturasVantive = "src/main/resources/config.properties";
	//public static final String facturasVantive = "config.properties";
	
	public static final String obtenerFacturasVantive = "select a.bill_ref_no "
			+ " from tc_facturas_cab a, wb_facturas_cab b "
			+ "where a.tcfacturascabid = b.tcfacturascabid (+) "
			+ "and a.tcfacturascabid >= 23851067 "
			+ "and a.estado = 'P' "
			+ "and b.url is null "
			+ "and rownum < 100 "
			+ "order by 1 desc ";
	//
	//+ " and b.dispositivo is null "
	
	//Obtener parametro para WS
		/*public static String obtenerParametro(String parametro, List<TcFacturasVantiveModel> parametros) {

			if (parametros != null && parametros.size() > 0) {
				for (TcFacturasVantiveModel item : parametros) {
					if (item.getObjeto().equals(parametro)) {
						logger.info("OBJETO => "+item.getObjeto()+" - VALOR OBJETO1 => "+item.getValorObjeto1());
						return item.getValorObjeto1();
					}
				}
			} else {
				return "";
			}

			return "";
		}*/
		
						
}
