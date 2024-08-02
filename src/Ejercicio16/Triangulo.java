package Ejercicio16;
import javax.swing.*;
public class Triangulo {
    private int sumOfAngles;

    public Triangulo(int sumOfAngles) {
        this.sumOfAngles = sumOfAngles;
    }

    public Triangulo() {
    }

    public int getSumOfAngles() {
        return sumOfAngles;
    }

    public void setSumOfAngles(int sumOfAngles) {
        this.sumOfAngles = sumOfAngles;
    }

    public boolean isTriangle() {
        return sumOfAngles == 180;
    }

    public void displayTriangleStatus() {
        if (isTriangle()) {
            JOptionPane.showMessageDialog(null, "It is a triangle.");
        } else {
            JOptionPane.showMessageDialog(null, "It is not a triangle.");
        }
    }
}
