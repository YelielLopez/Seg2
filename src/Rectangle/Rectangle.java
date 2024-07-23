package Rectangle;

import javax.swing.*;

public class Rectangle {


    public int base;
    public int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void consultInfo(){
        JOptionPane.showMessageDialog(null, "Información ingresada: " + "\nBase: " + getBase() + "\nAltura: " + getHeight());

    }

    public void calculate(){
        int area = base * height;
        JOptionPane.showMessageDialog(null, "El área del rectangulo según la información ingresada es: " + area);
    }
}
