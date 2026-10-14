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
		}catch(Exception e) {
			
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
