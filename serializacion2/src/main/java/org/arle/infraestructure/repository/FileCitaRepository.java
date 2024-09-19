package org.arle.infraestructure.repository;


import org.arle.domain.Cita;
import org.arle.domain.Paciente;
import org.arle.interfaces.CitaRepository;
import org.arle.interfaces.CitaRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCitaRepository implements CitaRepository {
    private static final String FILE_NAME = "citas.dat";

    @Override
    public void save(Cita cita) {
        List<Cita> citas = findAll();
        citas.add(cita);
        saveAll(citas);
    }

@Override
    public Cita findById(String nombre) {
        return findAll().stream()
                .filter(e -> e.getNombreCita() == nombre)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Cita> findAll() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Cita>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


    private void saveAll(List<Cita> citas) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(citas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete2(String nombre) {
        List<Cita> citas = findAll();
        citas.removeIf(e -> e.getNombreCita() == nombre);
        saveAll(citas);
    }

    public void delete(Cita cita) {
        List<Cita> citas = findAll();
        citas.removeIf(e -> e.getNombreCita() == cita.getNombreCita());
        saveAll(citas);
    }


}

