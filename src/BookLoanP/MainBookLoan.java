package BookLoanP;

import javax.swing.*;

public class MainBookLoan {
    public static void main(String[] args) {
        BookLoan loan1 = new BookLoan();

        BookLoan loan2 = new BookLoan((int)(Math.random() *100), "22/07/2025", "El señor de los aniillos",(int)(Math.random() *10), 14,"Good" );

        JOptionPane.showMessageDialog(null, "Welcome to the library loan system");
        int question = JOptionPane.showConfirmDialog(null, "Do you want to borrow a book?");

        switch (question) {
            case JOptionPane.YES_OPTION:
             JOptionPane.showMessageDialog(null, "Please enter the information to be able to lend you the book");

                loan1.setLoanCode((int)(Math.random() *100));
                loan1.setLoanDate(JOptionPane.showInputDialog("Enter the date for the loan DD/MM/YY"));
                loan1.setBookName(JOptionPane.showInputDialog("Enter the name of the book"));
                loan1.setUserCode((int)(Math.random() *10));
                loan1.setLoanDays(Integer.parseInt(JOptionPane.showInputDialog("Enter the days you want the book")));
                loan1.setLoanStatus(JOptionPane.showInputDialog("Enter the condition of the book: Good, Fair, Damaged"));
             break;

             case JOptionPane.NO_OPTION:
                 JOptionPane.showMessageDialog(null,"Thank you very much for your time");
                 break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null,"Thank you very much for your time");
                break;
            case JOptionPane.CLOSED_OPTION:
                JOptionPane.showMessageDialog(null,"Thank you very much for your time");
                break;
        }
        int cont = JOptionPane.showConfirmDialog(null, "do you wish to continue?");
        while (cont == JOptionPane.YES_OPTION) {
            String[] options = {"Check loan information", "Check loan status"};

            int confirm = JOptionPane.showOptionDialog(null, "What do you want to do now?", "Decision",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            if (confirm == 0) {
                loan1.consulLoanInfo();
            } else if (confirm == 1) {
                loan1.consultLoanStatus();
            } else
                JOptionPane.showMessageDialog(null, "We didn't get your answer");


        }

        System.out.println("La otra información ingresada "+ loan2);
    }
}
