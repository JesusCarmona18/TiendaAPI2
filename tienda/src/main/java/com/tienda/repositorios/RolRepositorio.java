package com.tienda.repositorios;

import com.tienda.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepositorio extends JpaRepository<Rol, Long> {
}
