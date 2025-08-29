package Ejercicio2;

public class Arquero extends Personaje implements IAtaqueFisico {
    private Habilidad habilidad;

    public Arquero(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
        this.habilidad = new Habilidad("Flecha Poderosa", 35);
    }

