package org.Yeliel.interfaces;

import org.Yeliel.domain.Usuario;

import java.util.List;

public interface UsuarioRepository {
    void save(Usuario usuario);
    Usuario findById(String nombre);
    List<Usuario> findAll();
    void update(Usuario usuario);
    void delete(String nombre);
}
