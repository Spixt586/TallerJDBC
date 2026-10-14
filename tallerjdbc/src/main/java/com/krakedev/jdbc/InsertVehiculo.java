package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InsertVehiculo {
	private static final Logger log = LogManager.getLogger(InsertVehiculo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pSQL;
		String sql = """ 
				INSERT INTO vehiculos(placa, marca, modelo, anio, precio, color, disponible)
				VALUES(?,?,?,?,?,?,?);
				""";
		try {
			conn = Conexion.getConnection();
			pSQL = conn.prepareStatement(sql);
			pSQL.setString(1, "PBA-1149");
			pSQL.setString(2, "TOYOTA");
			pSQL.setString(3, "Corolla");
			pSQL.setInt(4, 2022);
			pSQL.setDouble(5, 10500.00);
			pSQL.setString(6, "Blanco");
			pSQL.setBoolean(7, true);
			int vehiculoIns = pSQL.executeUpdate();
			
			log.info("Vehículos insertados: " + vehiculoIns);
			log.info("Conexión realizada");
		}catch(SQLException e) {
			log.error("Error en la conexión" + e.getMessage());
		}finally {
			try {
				conn.close()
;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}

}
