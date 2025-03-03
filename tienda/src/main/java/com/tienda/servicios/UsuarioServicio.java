package com.tienda.servicios;

import com.tienda.entidades.Usuario;
import com.tienda.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private RolRepositorio rolRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registrar(Usuario usuario) {
        usuario.setContrasena(passwordEncoder.encode(usuario.getContrasena()));
        usuarioRepositorio.save(usuario);
    }

    public String autenticar(String nombreUsuario, String contrasena) {
        // Lógica de autenticación con validación de contraseña
        return "TOKEN_GENERADO"; // Generar token JWT real
    }

    public void editarUsuario(Long id, Usuario usuario, Authentication autenticacion) {
        // Lógica de edición
    }

    public void eliminarUsuario(Long id, Authentication autenticacion) {
        // Lógica de eliminación
    }
}
