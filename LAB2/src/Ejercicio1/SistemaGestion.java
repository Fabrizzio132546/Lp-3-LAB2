package Ejercicio1;

import java.util.Scanner;

public class SistemaGestion {
    private Estudiante[] estudiantes;
    private int numEstudiantes;
    private Curso[] cursos;
    private int numCursos;
    private Scanner scanner = new Scanner(System.in);

    public SistemaGestion(int maxEst, int maxCursos) {
        estudiantes = new Estudiante[maxEst];
        numEstudiantes = 0;
        cursos = new Curso[maxCursos];
        numCursos = 0;
    }

    public void addCurso(Curso c) {
        if (numCursos < cursos.length) {
            cursos[numCursos++] = c;
        }
    }

    public void registrarEstudiante() {
        System.out.print("Nombre: ");
        String n = scanner.nextLine().trim();
        System.out.print("DNI: ");
        String d = scanner.nextLine().trim();
        System.out.print("Carrera: ");
        String car = scanner.nextLine().trim();

        if (numEstudiantes >= estudiantes.length) {
            System.out.println("No se pueden registrar mas estudiantes"  + "\n");
            return;
        }

        Estudiante e = new Estudiante(n, d, car);
        estudiantes[numEstudiantes++] = e;
        e.registrar();
    }

    public void inscribirEstudiante() {
        if (numEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados."  + "\n" );
            return;
        }
        if (numCursos == 0) {
            System.out.println("No hay cursos disponibles"  + "\n");
            return;
        }

        System.out.print("Codigo del estudiante: "  + "\n");
        int cod = scanner.nextInt(); scanner.nextLine();
        Estudiante e = buscarEst(cod);
        if (e == null) {
            System.out.println("No existe estudiante con codigo: " + cod  + "\n");
            return;
        }

        mostrarCursos();
        System.out.print("Escoge el curso: ");
        String nom = scanner.nextLine().trim();
        Curso c = buscarCurso(nom);
        if (c == null) {
            System.out.println("No existe el curso: " + nom);
            return;
        }

        if (c.cupos() <= 0) {
            System.out.println("No hay cupos en el curso"  + "\n");
            return;
        }
        if (c.estaInscrito(e.getCodigo())) {
            System.out.println("Ya se encuentra en el curso"  + "\n");
            return;
        }

        boolean verificacion = c.addEst(e);
        if (verificacion) {
            System.out.println("Se ha inscrito"  + "\n");
        } else {
            System.out.println("No se ha inscrito"  + "\n");
        }
    }

    public void mostrarCursos() {
        if (numCursos == 0) {
            System.out.println("No hay cursos"  + "\n");
            return;
        }
        for (int i = 0; i < numCursos; i++) {
            System.out.println("Curso: " + cursos[i].getNombre());
            System.out.println("Profesor: " + cursos[i].getProf().getNombre());
            System.out.println("Cupos: " + cursos[i].cupos() + "\n");
        }
    }

    public void reportes() {
        if (numCursos == 0) {
            System.out.println("No hay cursos para reportar"  + "\n" );
            return;
        }
        for (int i = 0; i < numCursos; i++) {
            cursos[i].reporte();
        }
    }

    private Estudiante buscarEst(int cod) {
        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == cod) return estudiantes[i];
        }
        return null;
    }

    private Curso buscarCurso(String nom) {
        for (int i = 0; i < numCursos; i++) {
            if (cursos[i].getNombre().equalsIgnoreCase(nom)) return cursos[i];
        }
        return null;
    }
}