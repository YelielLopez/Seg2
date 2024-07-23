package ParEmployee;

import javax.swing.*;

public class MainEmployeePayment {
    public static void main(String[] args) {
        EmployeePayment employee = new EmployeePayment();

        employee.employeeId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado:"));
        employee.setBasicSalary(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario basico:")));
        employee.overtimeRate = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas extra:"));
        employee.setOvertimeHours(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas extra:")));
        employee.setDiscount(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el descuento:")));
        employee.setLoanDeduction(Double.parseDouble(JOptionPane.showInputDialog("Introduzca la descuento del préstamo:")));
        employee.setBonus(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el bonus:")));

        employee.calculateNetSalary();

        JOptionPane.showMessageDialog(null, "El salario del empleado es de: " + employee.getNetSalary());
    }
}

