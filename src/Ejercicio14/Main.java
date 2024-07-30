package Ejercicio14;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Good morning! Welcome to the Population Discomfort Program.");

        String gender = JOptionPane.showInputDialog(null, "Please enter your gender");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age"));

        int wellBeing = calculateWellBeing(gender, age);
        if (wellBeing != -1) {
            JOptionPane.showMessageDialog(null, "You will receive $" + wellBeing);
        } else {
            JOptionPane.showMessageDialog(null, "That gender does not exist");
        }
    }
    public static int calculateWellBeing(String gender, int age) {
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 50) {
                return 120000;
            } else if (age >= 30 && age < 50) {
                return 100000;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            return 40000;
        }
        return -1;
    }
}
/*
package Ejercicio14;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Good morning! Welcome to the Population Discomfort Program.");
        String gender = JOptionPane.showInputDialog(null, "Please enter your gender");
        String ageInput = JOptionPane.showInputDialog(null, "Enter your age");
        int age = Integer.parseInt(ageInput);
        Main mainInstance = new Main();
        int wellBeing = gender.equals("Female") && age >= 50 ? 120_000 : gender.equals("Female") && (age >= 30 || age < 50) ? 100_000 : gender.equals("Male") ? 40_000 : -1;
        JOptionPane.showMessageDialog(null, wellBeing != -1 ? "You will receive $" + wellBeing : "That gender does not exist");
    }
}*/
