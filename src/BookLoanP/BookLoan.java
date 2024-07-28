package BookLoanP;

import javax.swing.*;

public class BookLoan {

    public int loanCode;
    public String loanDate;
    public String bookName;
    public int userCode;
    public int loanDays;
    public String loanStatus;

    public int getLoanCode() {
        return loanCode;
    }

    public void setLoanCode(int loanCode) {
        this.loanCode = loanCode;

    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public int getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public void consultLoanStatus(){
        JOptionPane.showMessageDialog(null,"The status of your book is: " + getLoanStatus());
    }

    public void consulLoanInfo(){
        JOptionPane.showMessageDialog(null, "Loan information: " + "\nBook status: " +
                getLoanStatus() +"\nLoan code: " + getLoanCode() + "\nLoan date: "+ getLoanDate() + "\nBook name: " +
                getBookName() + "\nUser code: " + getUserCode() + "\nLoan days: " +getLoanDays());
    }
}

