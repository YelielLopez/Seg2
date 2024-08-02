package Ejercicio11;
import javax.swing.*;
public class NumberChecker {
    private int number;

    public NumberChecker(int number) {
        this.number = number;
    }

    public NumberChecker() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public void displayNumberType() {
        if (isEven()) {
            JOptionPane.showMessageDialog(null, number + " is an even number.");
        } else {
            JOptionPane.showMessageDialog(null, number + " is an odd number.");
        }
    }
}
