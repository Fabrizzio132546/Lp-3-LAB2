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
