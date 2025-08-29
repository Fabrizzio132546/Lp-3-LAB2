package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Personaje p1 = new Arquero("Fabrizzio", 140, 1, 30);
        Personaje p2 = new Mago("Lizardo", 120, 1, 25);

        Personaje jugadorActual = null;
        Personaje enemigo = null;
