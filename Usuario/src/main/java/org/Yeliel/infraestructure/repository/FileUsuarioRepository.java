package org.Yeliel.infraestructure.repository;

import org.Yeliel.domain.Usuario;
import org.Yeliel.interfaces.UsuarioRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileUsuarioRepository implements UsuarioRepository {
    private static final String FILE_NAME = "Usuarios.dat";

    @Override
    public void save(Usuario usuario) {
        List<Usuario> usuarios = findAll();
        usuarios.add(usuario);
        saveAll(usuarios);
    }

    @Override
    public Usuario findById(String nombre) {
        return findAll().stream()
                .filter(e -> Objects.equals(e.getNombre(), nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Usuario> findAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Usuario>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void update(Usuario usuario) {
        List<Usuario> usuarios = findAll();
        for (int i = 0; i < usuarios.size(); i++) {
            if (Objects.equals(usuarios.get(i).getNombre(), usuario.getNombre())) {
                usuarios.set(i, usuario);
                break;
            }
        }
        saveAll(usuarios);
    }

    @Override
    public void delete(String nombre) {
        List<Usuario> usuarios = findAll();
        usuarios.removeIf(e -> Objects.equals(e.getNombre(), nombre));
        saveAll(usuarios);
    }

    private void saveAll(List<Usuario> usuarios) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
