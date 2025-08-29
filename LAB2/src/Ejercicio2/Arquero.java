package Ejercicio2;

public class Arquero extends Personaje implements IAtaqueFisico {
    private Habilidad habilidad;

    public Arquero(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
        this.habilidad = new Habilidad("Flecha Poderosa", 35);
    }
    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha contra " + enemigo.nombre);
        enemigo.vida -= ataque;
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }

    @Override
    public void usarHabilidad(Personaje enemigo) {
        System.out.println(nombre + " usa " + habilidad.getNombre());
        enemigo.vida -= habilidad.getPoder();
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }

