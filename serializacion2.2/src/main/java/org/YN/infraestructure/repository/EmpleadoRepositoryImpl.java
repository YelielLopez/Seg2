package org.YN.infraestructure.repository;

import org.YN.domain.Empleado;
import org.YN.interfaces.EmpleadoRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    private static final String ARCHIVO_EMPLEADOS = "empleados.dat";

    @Override
    public List<Empleado> cargarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ARCHIVO_EMPLEADOS))) {
            empleados = (List<Empleado>) ois.readObject();
        } catch (Exception e) {
            // Manejo de excepciones, archivo no encontrado, etc.
            e.printStackTrace();
        }
        return empleados;
    }

    @Override
    public void guardarEmpleados(List<Empleado> empleados) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ARCHIVO_EMPLEADOS))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public Empleado findById(int id) {
        return null;
    }

    @Override
    public List<Empleado> findAll() {
        return List.of();
    }

    @Override
    public void update(Empleado empleado) {

    }

    @Override
    public void delete(int id) {

    }
}
