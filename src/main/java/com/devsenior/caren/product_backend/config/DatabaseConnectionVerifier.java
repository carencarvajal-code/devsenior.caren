package com.devsenior.caren.product_backend.config;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnectionVerifier implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	@Override
	public void run(String... args) throws Exception {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("========================================");
			System.out.println("✅ CONEXIÓN A POSTGRESQL EXITOSA");
			System.out.println("========================================");
			System.out.println("URL: " + connection.getMetaData().getURL());
			System.out.println("Usuario: " + connection.getMetaData().getUserName());
			System.out.println("Driver: " + connection.getMetaData().getDriverName());
			System.out.println("Versión BD: " + connection.getMetaData().getDatabaseProductVersion());
			System.out.println("========================================");
		} catch (Exception e) {
			System.err.println("========================================");
			System.err.println("❌ ERROR DE CONEXIÓN A POSTGRESQL");
			System.err.println("========================================");
			System.err.println("Mensaje: " + e.getMessage());
			System.err.println("========================================");
			throw e;
		}
	}
}

