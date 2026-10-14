package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UpdateVehiculo {
	private static final Logger log = LogManager.getLogger(SelectVehiculo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pSQL = null;
		
		try {
		conn = Conexion.getConnection();
		
		String sql = """
				UPDATE vehiculos SET marca = ? , modelo = ?, anio = ?, precio = ?, color = ?, disponible = ?, kilometraje = ?
				WHERE placa = ?;
				""";
		pSQL = conn.prepareStatement(sql);
		pSQL.setString(1, "Chevrolet");
		pSQL.setString(2, "Groove");
		pSQL.setInt(3, 2025);
		pSQL.setDouble(4, 18500.00);
		pSQL.setString(5, "gris");
		pSQL.setBoolean(6, false);
		pSQL.setInt(7, 45000);
		pSQL.setString(8, "PBB-1149");
		
		int vUpdate = pSQL.executeUpdate();
		log.info("Vehículos actualizados: " + vUpdate);
		
		
		}catch(Exception e) {
			log.error("Error al actualizar: " + e.getMessage());
		}finally {//Finally protegido para evitar NullPointerException con if
			try {
				if(pSQL != null) {
					conn.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
