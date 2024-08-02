package Ejercicio15;

public class Main {
    public static void main(String[] args) {
        GymMembership membership15Days = new GymMembership(15, 18000);
        GymMembership membership30Days = new GymMembership(30, 35000);
        GymMembership membership90Days = new GymMembership(90, 86000);

        System.out.println("Monthly cost for 15 days membership: " + membership15Days.calculateMonthlyCost());
        System.out.println("Monthly cost for 30 days membership: " + membership30Days.calculateMonthlyCost());
        System.out.println("Monthly cost for 3 months membership: " + membership90Days.calculateMonthlyCost());
    }
}