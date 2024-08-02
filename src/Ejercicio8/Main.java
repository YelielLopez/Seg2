package Ejercicio8;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        SalaryCalculator calculator2 = new SalaryCalculator(28, "Juan", 0.18);
        calculator.setName(JOptionPane.showInputDialog("Enter the employee's name:"));
        calculator.setHoursWorked(Integer.parseInt(JOptionPane.showInputDialog("Enter the number of hours worked:")));
        if (calculator.getHoursWorked() <= 10) {
            calculator.setHourlyRate(30000);
        } else {
            calculator.setHourlyRate(33000);
        }
        calculator.printSalaryDetails();

        System.out.println(calculator2);
    }
}
