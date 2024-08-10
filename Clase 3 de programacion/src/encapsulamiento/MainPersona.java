package encapsulamiento;

import javax.swing.*;
import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el id");
        persona.setId(sc.nextInt());
        persona.setNombre(sc.next(JOptionPane.showInputDialog(null,"Ingrese el nombre")));

        JOptionPane.showMessageDialog(null, persona.getNombre());

        System.out.println(persona);

        int x = 28;
        Integer y = 28;


    }

}
