package User;

import javax.swing.*;

public class MainUser {
    public static void main(String[] args) {
        User user = new User();


        user.BaseUser = "admin";
        user.BasePassword = "1234";


        user.EnteredUser = JOptionPane.showInputDialog("Enter your username:");


        user.EnteredPassword = JOptionPane.showInputDialog("Enter your password:");


        user.validateState();
        user.allowAccess();
    }
}
