package org.example.Interfaces;

import org.example.Domain.Paciente;

import java.util.List;

public interface PacientesRepository {
    void save(Paciente paciente);
    void update(Paciente paciente);

    void delete(int id);

    Paciente findById(long id);
    List<Paciente> findAll();
}
