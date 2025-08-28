package Ejercicio1;

public class Curso implements IReporte {
    private String nombre;
    private Profesor prof;
    private String categoria;
    private Estudiante[] alumnos;
    private int numAlumnos;

    public static final int MaxAlum = 40;

    public Curso(String nom, Profesor p, String cat) {
        this.nombre = nom;
        this.prof = p;
        this.categoria = cat;
        this.alumnos = new Estudiante[MaxAlum];
        this.numAlumnos = 0;
    }

    public String getNombre() { return nombre; }
    public Profesor getProf() { return prof; }
    public String getCat() { return categoria; }
    public int getNumAlumnos() { return numAlumnos; }

    public int cupos() { return MaxAlum - numAlumnos; }

    public boolean estaInscrito(int codEst) {
        for (int i = 0; i < numAlumnos; i++) {
            if (alumnos[i].getCodigo() == codEst) return true;
        }
        return false;
    }

    public boolean addEst(Estudiante e) {
        if (numAlumnos >= MaxAlum) return false;
        if (estaInscrito(e.getCodigo())) return false;
        alumnos[numAlumnos++] = e;
        return true;
    }

    @Override
    public void reporte() {
        System.out.println("Curso: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Profesor: " + (prof != null ? prof.getNombre() : "sin prof"));
        System.out.println("Alumnos inscritos: " + numAlumnos);
        System.out.println("Cupos disponibles: " + cupos());

        if (numAlumnos == 0) {
            System.out.println("No hay inscritos.");
        } else {
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println("Nombre: " + alumnos[i].getNombre());
                System.out.println("Codigo: " + alumnos[i].getCodigo() + "\n");
            }
        }
    }
}