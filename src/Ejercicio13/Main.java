package Ejercicio13;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
        int thirdNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the third number"));
        Mayor mayorInstance = new Mayor();
        mayorInstance.setMayor(Math.max(firstNumber, Math.max(secondNumber, thirdNumber)));
        mayorInstance.displayLargestNumber();
    }
}
