package com.ejemplo.gestion_usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.ejemplo.gestion_usuarios.modelo")
public class GestionUsuariosApplication {
    public static void main(String[] args) {
        SpringApplication.run(GestionUsuariosApplication.class, args);
    }
}
