package EmployeePayment;

public class EmployeePayment {

    public int employeeCode;
    public int extraHours;


    private double basicSalary;
    private double numberOfHours;
    private double discount;
    private double loanDiscount;
    private double bonus;
    private double netPay;


    public EmployeePayment() {
        this.employeeCode = (int) (Math.random() * 100);
    }


    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }


    public double getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(double numberOfHours) {
        this.numberOfHours = numberOfHours;
    }


    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


    public double getLoanDiscount() {
        return loanDiscount;
    }

    public void setLoanDiscount(double loanDiscount) {
        this.loanDiscount = loanDiscount;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public double getNetPay() {
        return netPay;
    }


    public double calculateExtraHourValue() {
        return extraHours * (basicSalary / numberOfHours);
    }


    public double calculateAccrued() {
        return basicSalary + calculateExtraHourValue() + bonus;
    }


    public double calculateDeducted() {
        return discount + loanDiscount;
    }


    public void calculateNetPay() {
        netPay = calculateAccrued() - calculateDeducted();
    }
}
