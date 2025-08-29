package Ejercicio2;

public class Mago extends Personaje implements IAtaqueMagico {
    private Habilidad habilidad;

    public Mago(String nombre, int vida, int nivel, int ataque) {
        super(nombre, vida, nivel, ataque);
        this.habilidad = new Habilidad("Bola de Fuego", 40);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " lanza un hechizo bssico contra " + enemigo.nombre);
        enemigo.vida -= ataque;
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }

    @Override
    public void usarHabilidad(Personaje enemigo) {
        System.out.println(nombre + " usa " + habilidad.getNombre());
        enemigo.vida -= habilidad.getPoder();
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }

    @Override
    public void ataqueMagico(Personaje enemigo) {
        System.out.println(nombre + " invoca un poder msgico devastador");
        enemigo.vida -= (ataque + 20);
        if (enemigo.vida <= 0) enemigo.vida = 0;
    }
}
