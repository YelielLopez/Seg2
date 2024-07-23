package ParEmployee;

    public class EmployeePayment {

        public int employeeId;
        private double basicSalary;
        public double overtimeRate;
        private int overtimeHours;
        private double discount;
        private double loanDeduction;
        private double bonus;
        private double netSalary;


        public double getBasicSalary() {
            return basicSalary;
        }

        public void setBasicSalary(double basicSalary) {
            this.basicSalary = basicSalary;
        }

        public int getOvertimeHours() {
            return overtimeHours;
        }

        public void setOvertimeHours(int overtimeHours) {
            this.overtimeHours = overtimeHours;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        public double getLoanDeduction() {
            return loanDeduction;
        }

        public void setLoanDeduction(double loanDeduction) {
            this.loanDeduction = loanDeduction;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public double getNetSalary() {
            return netSalary;
        }

        public void setNetSalary(double netSalary) {
            this.netSalary = netSalary;
        }

        // Calculation methods
        public double calculateOvertimeValue() {
            return overtimeRate * overtimeHours;
        }

        public double calculateGrossSalary() {
            return basicSalary + calculateOvertimeValue() + bonus;
        }

        public double calculateDeductions() {
            return discount + loanDeduction;
        }

        public double calculateNetSalary() {
            netSalary = calculateGrossSalary() - calculateDeductions();
            return netSalary;
        }
}
