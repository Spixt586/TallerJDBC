package com.krakedev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionPostgres {
	private static final Logger log = LogManager.getLogger(ConexionPostgres.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Rex.lAVALL2045*");
			
			log.info("Conexión Exitosa");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("Error de conexión" + e.getMessage());
		}finally {//sirve para que la conección se cierre
			try {
				con.close();
			} catch (SQLException e) {
				log.error("Error de conexión" , e.getMessage());
			}		
			
		}
	}

}
