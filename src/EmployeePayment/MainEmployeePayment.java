package EmployeePayment;

import javax.swing.*;

public class MainEmployeePayment {
    public static void main(String[] args) {
        EmployeePayment employee = new EmployeePayment();


        employee.setBasicSalary(Double.parseDouble(JOptionPane.showInputDialog("Enter the basic salary:")));
        employee.setNumberOfHours(Double.parseDouble(JOptionPane.showInputDialog("Enter the number of hours worked:")));
        employee.extraHours = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of extra hours:"));
        employee.setDiscount(Double.parseDouble(JOptionPane.showInputDialog("Enter the discount:")));
        employee.setLoanDiscount(Double.parseDouble(JOptionPane.showInputDialog("Enter the loan discount:")));
        employee.setBonus(Double.parseDouble(JOptionPane.showInputDialog("Enter the bonus:")));


        employee.calculateNetPay();


        String results = "Employee Code: " + employee.employeeCode + "\n" +
                "Basic Salary: " + employee.getBasicSalary() + "\n" +
                "Number of Hours Worked: " + employee.getNumberOfHours() + "\n" +
                "Extra Hours: " + employee.extraHours + "\n" +
                "Discount: " + employee.getDiscount() + "\n" +
                "Loan Discount: " + employee.getLoanDiscount() + "\n" +
                "Bonus: " + employee.getBonus() + "\n" +
                "Net Pay: " + employee.getNetPay();
        JOptionPane.showMessageDialog(null, results);
    }
}

