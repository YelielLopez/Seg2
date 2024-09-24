package org.Yeliel.aplication;

import org.Yeliel.aplication.service.UsuarioService;
import org.Yeliel.infraestructure.repository.FileUsuarioRepository;
import org.Yeliel.interfaces.UsuarioRepository;

public class Main {
    public static void main(String[] args) {
        UsuarioRepository repository = new FileUsuarioRepository();
        UsuarioService service = new UsuarioService(repository);
        ConsolaUI ui = new ConsolaUI(service);
        ui.iniciar();
    }
}