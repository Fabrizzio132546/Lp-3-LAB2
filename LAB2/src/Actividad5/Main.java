package Actividad5;

import java.util.Scanner;

public class banco {
    public static void main(String[] args) {
        cuenta[] cuentas = new cuenta[10];
        for (int i = 0; i < 5; i++) {
            cuentas[i] = new cuentaahorro("ah" + (i + 1), 1000, 0.02);
        }
        for (int i = 5; i < 10; i++) {
            cuentas[i] = new cuentacorriente("cc" + (i + 1), 1000);
        }

        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nmenu:");
            System.out.println("d) depositar");
            System.out.println("r) retirar");
            System.out.println("c) consultar");
            System.out.println("s) salir");
            System.out.print("opcion: ");
            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "d":
                    System.out.print("numero de cuenta: ");
                    String numdep = sc.nextLine();
                    System.out.print("monto: ");
                    double montodep = sc.nextDouble();
                    sc.nextLine();
                    for (cuenta c : cuentas) {
                        if (c != null && c.numerocuenta.equals(numdep)) {
                            c.depositar(montodep);
                            System.out.println("nuevo saldo: " + c.getsaldo());
                        }
                    }
                    break;
                case "r":
                    System.out.print("numero de cuenta: ");
                    String numret = sc.nextLine();
                    System.out.print("monto: ");
                    double montoret = sc.nextDouble();
                    sc.nextLine();
                    for (cuenta c : cuentas) {
                        if (c != null && c.numerocuenta.equals(numret)) {
                            c.retirar(montoret);
                            System.out.println("nuevo saldo: " + c.getsaldo());
                        }
                    }
                    break;
                case "c":
                    for (cuenta c : cuentas) {
                        if (c != null) {
                            c.consultar();
                            System.out.println(c.numerocuenta + " -> saldo: " + c.getsaldo());
                        }
                    }
                    break;
                case "s":
                    salir = true;
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }
        sc.close();
    }
}

