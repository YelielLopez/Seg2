package Ejercicio13;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        String input3 = JOptionPane.showInputDialog("Enter the third number:");


        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);


        GreatestNumber greatestNumber = new GreatestNumber(num1, num2, num3);


        int greatest = greatestNumber.findGreatest();
        JOptionPane.showMessageDialog(null, "The greatest number is: " + greatest);
    }
}
