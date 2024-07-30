package Ejercicio13;
import javax.swing.*;
public class Mayor {
    private int largestNumber;

    public int getMayor() {
        return largestNumber;
    }

    public void setMayor(int mayor) {
        this.largestNumber = mayor;
    }

    public void displayLargestNumber() {
        JOptionPane.showMessageDialog(null, "The largest number is: " + largestNumber);
    }
}
