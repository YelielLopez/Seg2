package Ejercicio11;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Please enter a number:");
        int userNumber = Integer.parseInt(input);

        NumberChecker checker = new NumberChecker();
        checker.setNumber(userNumber);

        checker.displayNumberType();
    }
}
