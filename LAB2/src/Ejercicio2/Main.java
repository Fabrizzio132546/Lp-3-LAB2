package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personaje p1 = new Arquero("Fabrizzio", 140, 1, 30);
        Personaje p2 = new Mago("Lizardo", 120, 1, 25);

        Personaje jugadorActual = null;
        Personaje enemigo = null;
                while (p1.vida > 0 && p2.vida > 0) {

            if (jugadorActual == null) {
                System.out.println("1 - para seleccionar personaje 1");
                System.out.println("2 - para seleccionar personaje 2");

                int opcion = 0;
                while (opcion < 1 || opcion > 2) {
                    System.out.print("selecciona personaje: ");
                    opcion = scanner.nextInt();
                }
                switch (opcion) {
                    case 1 -> jugadorActual = p1;
                    case 2 -> jugadorActual = p2;
                }
            }

            enemigo = (jugadorActual == p1) ? p2 : p1;

            System.out.println("\n   MENU    ");
            System.out.println("1 - para atacar enemigo");
            System.out.println("2 - para usar habilidad");
            System.out.println("3 - para usar habilidad potenciada");
            System.out.println("4 - para explorar mundo");
            System.out.println("5 - para ver info");
            System.out.println("6 - cambiar personaje");
            System.out.println("7 - para salir");

            int opcion = 0;
            while (opcion < 1 || opcion > 7) {
                System.out.print("Ingresa una opcion: ");
                opcion = scanner.nextInt();
            }

            switch (opcion) {
                case 1 -> jugadorActual.atacar(enemigo);
                case 2 -> jugadorActual.usarHabilidad(enemigo);
                case 3 -> jugadorActual.usarHabilidad(enemigo, 15); 
                case 4 -> jugadorActual.explorarMundo();
                case 5 -> jugadorActual.info();
                case 6 -> {
                    jugadorActual = (jugadorActual == p1) ? p2 : p1;
                    enemigo = (jugadorActual == p1) ? p2 : p1;
                    System.out.println("Cambiaste de personaje");
                }
                case 7 -> {
                    System.out.println("Se acabo el juego");
                    System.exit(0);
                }
            }
        } 

        System.out.println("El juego termino");
        scanner.close();
    }
}


