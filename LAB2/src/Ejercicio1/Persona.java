package Ejercicio1;

public abstract class Persona { //clase abstracta que servira como base para otras clases 
    protected String nombre; 
    protected String dni;
    protected int codigo;

    public Persona(String n, String d, int c) { //contructor 
        this.nombre = n;
        this.dni = d;
        this.codigo = c;
    }
    
    public abstract void info(); //metodo abstracto que las clases hijas deben implementar

    public int getCodigo() { return codigo; } //devuelve el codigo de la persona 
    public String getNombre() { return nombre; } //devuelve el nombre de la persona 
}
