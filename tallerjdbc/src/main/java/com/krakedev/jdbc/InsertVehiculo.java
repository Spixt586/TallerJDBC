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
		PreparedStatement pSQL = null;
		String sql = """
				INSERT INTO vehiculos(placa, marca, modelo, anio, precio, color, disponible, kilometraje)
				VALUES(?,?,?,?,?,?,?,?);
				""";
		try {
			conn = Conexion.getConnection();
			pSQL = conn.prepareStatement(sql);
			pSQL.setString(1, "PBB-1149");
			pSQL.setString(2, "Chevrolet");
			pSQL.setString(3, "Vermout");
			pSQL.setInt(4, 2021);
			pSQL.setDouble(5, 22500.00);
			pSQL.setString(6, "Azul");
			pSQL.setBoolean(7, true);
			pSQL.setInt(8, 250000);
			int vehiculoIns = pSQL.executeUpdate();

			log.info("Vehículos insertados: " + vehiculoIns);
			log.info("Conexión realizada");
		} catch (SQLException e) {
			log.error("Error en la conexión" + e.getMessage());
		} finally {//Finally protejido con if para evitar NullPointerException
			try {
				if (pSQL != null) {
					conn.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
