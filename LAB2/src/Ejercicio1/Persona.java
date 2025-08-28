package Ejercicio1;

public abstract class Persona {
    protected String nombre;
    protected String dni;
    protected int codigo;

    public Persona(String n, String d, int c) {
        this.nombre = n;
        this.dni = d;
        this.codigo = c;
    }
