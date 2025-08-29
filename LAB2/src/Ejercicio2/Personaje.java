package Ejercicio2;

import java.util.Random;

public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected int nivel;
    protected int ataque;
    protected Inventario inventario;


    protected static int contador = 0;
    protected static final int NIVEL_MAXIMO = 50;


    protected static final String MUNDO = "Planeta Tierra";


    public Personaje(String nombre, int vida, int nivel, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.nivel = nivel;
        this.ataque = ataque;
        this.inventario = new Inventario(3);
        contador++;
    }


    public abstract void atacar(Personaje enemigo);
    public abstract void usarHabilidad(Personaje enemigo);


    public void usarHabilidad(Personaje enemigo, int extraPoder) {
        System.out.println(nombre + " potencia su habilidad con +" + extraPoder);
        enemigo.vida -= extraPoder;
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }

    public void info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);
        System.out.println("Inventario: " + inventario.mostrarObjetos());
        System.out.println("Mundo: " + MUNDO + "\n");
    }

    protected void subirNivel() {
        if (nivel < NIVEL_MAXIMO) {
            nivel++;
            vida += 10;
            ataque += 5;
            System.out.println(nombre + " subió a nivel " + nivel);
        } else {
            System.out.println(nombre + " ya alcanzó el nivel máximo.");
        }
    }

    public void explorarMundo() {
        Random random = new Random();
        int evento = random.nextInt(4);
        switch (evento) {
            case 0 -> System.out.println(nombre + " no encontró nada.");
            case 1 -> {
                vida += 20;
                System.out.println(nombre + " encontró una poción y recuperó 20 de vida.");
            }
            case 2 -> {
                inventario.agregarObjeto("Objeto misterioso");
            }
            case 3 -> subirNivel();
        }
    }
}