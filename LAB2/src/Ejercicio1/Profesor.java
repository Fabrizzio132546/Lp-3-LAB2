package Ejercicio1;

public class Profesor extends Persona { //CLASE PROFESORR
    private String especialidad;
    public static final int MaxCurso = 3;

    public Profesor(String n, String d, int c, String esp) { //constructor 
        super(n, d, c);
        this.especialidad = esp;
    }

    @Override
    public void info() {
        System.out.println("Profesor: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Especialidad: " + especialidad  + "\n" );
    }

    public String getEsp() { return especialidad; }
}
