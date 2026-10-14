package com.krakedev.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;

public class DeleteVehiculo {
	private static final Logger log = LogManager.getLogger(DeleteVehiculo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pSQL = null;
		
		try {
			conn = Conexion.getConnection();
			String sql = """
					DELETE FROM vehiculos WHERE placa = ?;
					""";
			pSQL = conn.prepareStatement(sql);
			pSQL.setString(1, "PBA-1149");
			int vDelete = pSQL.executeUpdate();
			
			log.info("Vehículos eliminados: " + vDelete);
		}catch(Exception e) {
			log.error("Error al eliminar el Vehículo: " + e.getMessage());
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
