package com.qitcorp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import com.qitcorp.connection.ConnectionDB;
import com.qitcorp.model.TcFacturasVantiveModel;
import com.qitcorp.util.Tools;

public class ProcesoFacturasDao {

	private static final Logger logger = Logger.getLogger("log4j.properties");

	public ProcesoFacturasDao(){
		logger.info("Ingresa a constructor de ProcesoFacturasDao");
	}

	// Obtener parametros para consumo de WS Pagos y Servicio
	public static List<TcFacturasVantiveModel> obtenerParametrosWS() {
		List<TcFacturasVantiveModel> listResult = new ArrayList<TcFacturasVantiveModel>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rst = null;
		TcFacturasVantiveModel model;
		try {

			conn = ConnectionDB.getConnection();
			ps = conn.prepareStatement(Tools.obtenerFacturasVantive);
			rst = ps.executeQuery();
			while (rst.next()) {
				model = new TcFacturasVantiveModel(0, 0);
				model.setBillRefNo(rst.getInt(TcFacturasVantiveModel.FIELD_BILL_REF_NO));

				listResult.add(model);
			}
		} catch (Exception e) {
			logger.error(e);
		} finally {
			finalizaConexion(conn, ps, null, rst);
			logger.info("se manda a llamar el metodo de finaliza conexion en obtenerParametrosWS");
		}

		return listResult;
	}

	public List<TcFacturasVantiveModel> obtenerFacturasVantive() {
		List<TcFacturasVantiveModel> lst = new ArrayList<>();
		Statement stmt = null;
		ResultSet rst = null;
		Connection conn = null;
		TcFacturasVantiveModel obj;
		logger.info("Antes de ejecutar statement obtenerFacturasVantive");
		try {
			conn = ConnectionDB.getConnection();
			stmt = conn.createStatement();
			logger.info(Tools.obtenerFacturasVantive);
			rst = stmt.executeQuery(Tools.obtenerFacturasVantive);
			
			while (rst.next()) {				
				obj = new TcFacturasVantiveModel(0, 0);
				obj.setBillRefNo(rst.getInt(TcFacturasVantiveModel.FIELD_BILL_REF_NO));
				lst.add(obj);
				logger.info("se obtiene valor del campo bill_ref_no: "+TcFacturasVantiveModel.FIELD_BILL_REF_NO);
			}
			logger.info("Statement obtiene resultados obtenerFacturasVantive");
		} catch (Exception e) {
			logger.error("Exception => ",e);
		} finally {
			finalizaConexion(conn, null, stmt, rst);
			logger.info("se manda a llamar el metodo de finaliza conexion en obtenerFacturasVantive");
		}
		return lst;

	}

	private static void finalizaConexion(Connection conn, PreparedStatement ps, Statement stmt, ResultSet rst) {
		if (rst != null)
			try {
				rst.close();
			} catch (SQLException e) {
				logger.error(e);
			}
		if (ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				logger.error(e);
			}
		if (stmt != null)
			try {
				stmt.close();
				logger.info("cierra statement en metodo finaliza conexion.");
			} catch (SQLException e) {
				logger.error(e);
			}
		if (conn != null)
			try {
				conn.close();
				logger.info("cierra conexion en metodo finaliza conexion.");
			} catch (SQLException e) {
				logger.error(e);
			}

	}

	
	
}
