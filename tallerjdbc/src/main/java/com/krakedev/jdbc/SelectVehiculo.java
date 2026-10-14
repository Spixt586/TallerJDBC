package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectVehiculo {
	private static final Logger log = LogManager.getLogger(SelectVehiculo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pSQL = null;
		ResultSet rSet = null;

		try {
			conn = Conexion.getConnection();
			String sql = """
					SELECT * FROM vehiculos;
					""";
			pSQL = conn.prepareStatement(sql);
			rSet = pSQL.executeQuery();

			while (rSet.next()) {
				String placa = rSet.getString("placa");
				String marca = rSet.getString("marca");
				String modelo = rSet.getString("modelo");
				int anio = rSet.getInt("anio");
				double precio = rSet.getDouble("precio");
				String color = rSet.getString("color");
				boolean disponible = rSet.getBoolean("disponible");
				int kilometraje = rSet.getInt("kilometraje");

				log.info("Vehiculo: Placa: " + placa + " || Marca: " + marca + " || Modelo: " + modelo + " || Año: "
						+ anio + " || Precio: " + precio + " || Color: " + color + " || Disponibilidad: " + disponible + " || Kilometraje: " + kilometraje);
			}
		} catch (Exception e) {
			log.error("Error en los datos" + e.getMessage());
		} finally {//Finally protegido para evitar NullPointerException
			try {
				if(pSQL != null) {
					conn.close();	
				}
				if(rSet != null) {
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
