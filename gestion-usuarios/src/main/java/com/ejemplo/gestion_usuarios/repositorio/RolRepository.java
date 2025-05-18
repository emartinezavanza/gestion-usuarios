package com.ejemplo.gestion_usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.gestion_usuarios.modelo.Rol;

public interface RolRepository extends JpaRepository<Rol, Long> {
}