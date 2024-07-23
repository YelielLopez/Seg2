package Rectangle;

import javax.swing.*;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();

        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de calculo de rectangulos");

        int question = JOptionPane.showConfirmDialog(null, "¿Desea calcular el área de un rectangulo?");

        switch (question) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Por favor ingrese los datos para poder calcular el área");

                a.setBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Base")));
                a.setHeight(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura")));
                break;

            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Muchas gracias por su tiempo");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null, "Muchas gracias por su tiempo");
                break;
            case JOptionPane.CLOSED_OPTION:
                JOptionPane.showMessageDialog(null, "Muchas gracias por su tiempo");
                break;
        }
        int cont = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        while (cont == JOptionPane.YES_OPTION) {

            String[] options = {"calcular el área", "Consultar información ingresada", "Salir"};

            int confirm = JOptionPane.showOptionDialog(null, "¿Cual es su decición?", "Decición",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (confirm == 0) {
                a.calculate();
            } else if (confirm == 1) {
                a.consultInfo();
            } else
                JOptionPane.showMessageDialog(null, "Hasta luego");

        }

    }
}