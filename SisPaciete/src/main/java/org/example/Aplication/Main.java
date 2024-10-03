package org.example.Aplication;

import org.example.Aplication.Services.CitaService;
import org.example.Aplication.Services.PacienteService;
import org.example.Infraestructure.FileCitasRepository;
import org.example.Infraestructure.FilePacienteRepository;
import org.example.Interfaces.CitasRepository;
import org.example.Interfaces.PacientesRepository;

public class Main {
    public static void main(String[] args) {
        PacientesRepository repository = new FilePacienteRepository();
        PacienteService service = new PacienteService(repository);

        CitasRepository citasRepository = new FileCitasRepository();
        CitaService service2 = new CitaService(citasRepository);


        Menu menu = new Menu(service,service2);

        menu.iniciar();


    }
}
