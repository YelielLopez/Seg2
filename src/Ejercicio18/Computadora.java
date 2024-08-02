package Ejercicio18;


class Computer {
    private boolean beep;
    private boolean hardDriveSpin;


    public Computer(boolean beep, boolean hardDriveSpin) {
        this.beep = beep;
        this.hardDriveSpin = hardDriveSpin;
    }


    public boolean isBeep() {
        return beep;
    }

    public boolean isHardDriveSpin() {
        return hardDriveSpin;
    }

    public void setBeep(boolean beep) {
        this.beep = beep;
    }

    public void setHardDriveSpin(boolean hardDriveSpin) {
        this.hardDriveSpin = hardDriveSpin;
    }


    public String getStatus() {
        if (beep && hardDriveSpin) {
            return "Póngase en contacto con el técnico de apoyo";
        } else if (beep && !hardDriveSpin) {
            return "Verificar contactos de la unidad";
        } else if (!beep && !hardDriveSpin) {
            return "Traiga la computadora para repararla en la central.";
        } else {
            return "Compruebe las conexiones de altavoces";
        }
    }
}

