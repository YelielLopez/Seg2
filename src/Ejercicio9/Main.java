package Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Good Morning, Please write a number");
        int input1 = Integer.parseInt(input);
        queClaseEs calculator = new queClaseEs();
        calculator.setPositive(input1);
        calculator.setNegative(-input1);
        calculator.checkNumber();
    }
}
