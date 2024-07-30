package Ejercicio20;

public class CeluMovil {
    private String operator;
    private int fixedCharge;
    private int internationalCallRate;
    private int dataPackageRate;

    public CeluMovil(String operator) {
        this.operator = operator.toLowerCase();
        switch (this.operator) {
            case "tigo":
                this.fixedCharge = 45000;
                this.internationalCallRate = 200;
                this.dataPackageRate = 12000;
                break;
            case "claro":
                this.fixedCharge = 30000;
                this.internationalCallRate = 100;
                this.dataPackageRate = 18000;
                break;
            case "movistar":
                this.fixedCharge = 40000;
                this.internationalCallRate = 250;
                this.dataPackageRate = 8000;
                break;
            default:
                this.fixedCharge = 0;
                this.internationalCallRate = 0;
                this.dataPackageRate = 0;
                break;
            }
        }
    public String getOperator() {
        return operator;
    }

    public int getFixedCharge() {
        return fixedCharge;
    }

    public int getInternationalCallRate() {
        return internationalCallRate;
    }

    public int getDataPackageRate() {
        return dataPackageRate;
    }

    public int calculateTotalCost(int internationalMinutes, boolean includeDataPackage) {
        int totalCost = fixedCharge + (internationalMinutes * internationalCallRate);
        if (includeDataPackage) {
            totalCost += dataPackageRate;
        }
        return totalCost;
    }
}

