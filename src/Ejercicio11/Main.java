package Ejercicio11;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();

        String input = JOptionPane.showInputDialog(null, "Please enter a number:");
        int userNumber = Integer.parseInt(input);
        NumberChecker checker2 = new NumberChecker(20);



        checker.setNumber(userNumber);

        checker.displayNumberType();

        System.out.println(checker2);
    }
}
