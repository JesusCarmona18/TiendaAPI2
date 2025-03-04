package com.tienda.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.entidades.Usuario;
import com.tienda.servicios.UsuarioServicio;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PutMapping("/{id}")
    public ResponseEntity<?> editarUsuario(@PathVariable Long id, @RequestBody Usuario usuario, Authentication autenticacion) {
        usuarioServicio.editarUsuario(id, usuario, autenticacion);
        return ResponseEntity.ok("Datos actualizados correctamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id, Authentication autenticacion) {
        usuarioServicio.eliminarUsuario(id, autenticacion);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }
}
