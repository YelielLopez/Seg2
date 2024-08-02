package Ejercicio9;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        queClaseEs calculator = new queClaseEs();
        queClaseEs calculator2 = new queClaseEs(28, -12);
        String input = JOptionPane.showInputDialog(null, "Good Morning, Please write a number");
        int input1 = Integer.parseInt(input);


        calculator.setPositive(input1);
        calculator.setNegative(-input1);
        calculator.checkNumber();
        System.out.println(calculator2);
    }
}
