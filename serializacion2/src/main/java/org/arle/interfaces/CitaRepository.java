package org.arle.interfaces;

import org.arle.domain.Cita;
import java.util.List;

public interface CitaRepository {
    void save(Cita cita);
    Cita findById(String nombre);
    List<Cita> findAll();
    void delete(Cita cita);
    void delete2(String nombre);
}
