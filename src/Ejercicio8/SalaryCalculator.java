package Ejercicio8;
import javax.swing.*;
public class SalaryCalculator {
    private int hoursWorked;
    private String name;
    private double hourlyRate;

    public SalaryCalculator(int hoursWorked, String name, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public SalaryCalculator() {
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void printSalaryDetails() {
        String message = "Employee Name: " + name + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Hourly Rate: $" + hourlyRate + "\nTotal Salary: $" + calculateSalary();
        JOptionPane.showMessageDialog(null, message);
    }
}
