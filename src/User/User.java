package User;

import javax.swing.*;

public class User {

    public String BaseUser;
    public String EnteredUser;
    public String BasePassword;
    public String EnteredPassword;
    public boolean SystemState;

    public void validateState() {
        if (BaseUser.equals(EnteredUser) && BasePassword.equals(EnteredPassword)) {
            SystemState = true;
        } else {
            SystemState = false;
        }
    }



        public void allowAccess () {
            if (SystemState) {
                JOptionPane.showMessageDialog(null, "Access granted. Welcome!");
            } else {
                JOptionPane.showMessageDialog(null, "Access denied. Incorrect user or password.");
            }
        }

}
