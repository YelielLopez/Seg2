package Ejercicio14;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String gender = JOptionPane.showInputDialog("Enter your gender (female/male):");
        String inputAge = JOptionPane.showInputDialog("Enter your age:");


        int age = Integer.parseInt(inputAge);


        MunicipalitySupport support = new MunicipalitySupport("", 0);


        support.setGender(gender);
        support.setAge(age);


        int monthlySupport = support.calculateSupport();
        JOptionPane.showMessageDialog(null, "The monthly support received is: $" + monthlySupport);
    }
}