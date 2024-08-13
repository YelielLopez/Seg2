package Seguimiento3.Concierto;

public class Main {
    public static void main(String[] args) {
        Concierto concierto = new Concierto(10, 30);
        concierto.venderEntrada("VIP", 500000);
        concierto.venderEntrada("GENERAL", 200000);
        concierto.venderEntrada("VIP", 500000);
        concierto.venderEntrada("GENERAL", 200000);
        for (int i = 0; i < 9; i++) {
            concierto.venderEntrada("VIP", 500000);
        }
        concierto.registrarIngreso(1);
        concierto.registrarIngreso(2);
        concierto.registrarIngreso(11);
    }
}