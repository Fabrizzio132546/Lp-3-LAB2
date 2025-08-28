package Ejercicio1;

public class Estudiante extends Persona implements IRegistrar {
    private String carrera;

    public static final int MaxCurso = 5;
    public static final int codigobase = 2025000;
    private static int CodCont = codigobase;

    public Estudiante(String n, String d, String car) {
        super(n, d, CodCont++);
        this.carrera = car;
    }

    @Override
    public void registrar() {
        System.out.println("Estudiante registrado: " + nombre + " codigo: " + codigo  + "\n");
    }

    @Override
    public void info() {
        System.out.println("Estudiante " + nombre);
        System.out.println("DNI: " + dni );
        System.out.println("Codigo: " + codigo);
        System.out.println("Carrera: " + carrera  + "\n");
    }

    public String getCarrera() { return carrera; }
}