package org.Yeliel.aplication.service;


import org.Yeliel.domain.Usuario;
import org.Yeliel.interfaces.UsuarioRepository;

import java.util.List;

public class UsuarioService {
    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void crearUsuario(Usuario usuario) {
        repository.save(usuario);
    }

    public Usuario obtenerUsuario(String nombre) {
        return repository.findById(nombre);
    }

    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    public void actualizarContraseña(Usuario contraseña) {
        repository.update(contraseña);
    }

    public void eliminarUsuario(String nombre) {
        repository.delete(nombre);
    }
}