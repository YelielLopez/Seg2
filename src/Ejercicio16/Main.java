package Ejercicio16;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Triangulo triangle = new Triangulo();
        Triangulo triangle2 = new Triangulo(12);

        JOptionPane.showMessageDialog(null, "Good morning! Welcome to the Vertex Validator: Triangle Version");

        int angle1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the value of the first angle"));
        int angle2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the value of the second angle"));
        int angle3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the value of the third angle"));

        int sum = angle1 + angle2 + angle3;

        triangle.setSumOfAngles(sum);

        triangle.displayTriangleStatus();

        triangle2.setSumOfAngles(sum);

        triangle2.displayTriangleStatus();
    }
}
