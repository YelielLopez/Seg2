package Seguimiento3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Colegio {
    public class Estudiante {
        public String Nombres;
        public String Apellidos;
        public String NombrePadre;
        public String NombreMadre;
        public int Edad;
        private int Grado;
        public float PromedioAcademico;
        public List<String> TelefonosDeContacto;

        public Estudiante(String Nombres, String Apellidos, String NombrePadre, String NombreMadre, int Edad, int Grado, float PromedioAcademico) {
            this.Nombres = Nombres;
            this.Apellidos = Apellidos;
            this.NombrePadre = NombrePadre;
            this.NombreMadre = NombreMadre;
            this.Edad = Edad;
            this.Grado = Grado;
            this.PromedioAcademico = PromedioAcademico;
            this.TelefonosDeContacto = new ArrayList<>();
        }

        public Estudiante(String Nombres, String Apellidos, String NombrePadre, String NombreMadre, int Edad, int Grado, float PromedioAcademico, String... Telefonos) {
            this(Nombres, Apellidos, NombrePadre, NombreMadre, Edad, Grado, PromedioAcademico);
            this.TelefonosDeContacto = new ArrayList<>();
            for (String telefono : Telefonos) {
                this.TelefonosDeContacto.add(telefono);
            }
        }

        public void imprimirInformacion() {
            JOptionPane.showMessageDialog(null," El Estudiante Identificado como: " + Nombres + Apellidos+" a sus "+ Edad+" El Cual Cursa el Grado de "+Grado+" Con un Promedio academico de "+PromedioAcademico+" Con sus Padres y Identificados Como " + NombrePadre+" y " + NombreMadre+" Contactados Atraves de "+TelefonosDeContacto);
        }
    }

    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        double Min = 0.0;
        double Max = 5.0;
        double randomValue = Min + (Math.random() * (Max - Min));
        float PromedioAcademico = Math.round((float)randomValue);

        Estudiante E1 = colegio.new Estudiante("Pedro", "Chisme", "Jacinto", "Jane", 12, 11, PromedioAcademico);
        Estudiante E2 = colegio.new Estudiante("Maria", "La del Pueblo", "Carlos", "Luisa", 10, 10, PromedioAcademico, "123456789");
        Estudiante E3 = colegio.new Estudiante("Juan", "Metido", "Luis", "Ana", 15, 9, PromedioAcademico, "987654321", "1122334455");

        Estudiante [] estudiantes={E1,E2,E3};

        for (Estudiante estudiante: estudiantes){
            estudiante.imprimirInformacion();
        }

    }
}
