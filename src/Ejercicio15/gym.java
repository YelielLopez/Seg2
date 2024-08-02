package Ejercicio15;

class GymMembership {
    private int days;
    private double cost;


    public GymMembership(int days, double cost) {
        this.days = days;
        this.cost = cost;
    }


    public int getDays() {
        return days;
    }


    public void setDays(int days) {
        this.days = days;
    }


    public double getCost() {
        return cost;
    }


    public void setCost(double cost) {
        this.cost = cost;
    }


    public double calculateMonthlyCost() {
        if (days == 15) {
            return cost * 2;
        } else if (days == 30) {
            return cost;
        } else if (days == 90) {
            return cost / 3;
        } else {
            return 0;
        }
    }

}

