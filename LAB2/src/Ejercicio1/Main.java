package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Profesor[] profesores = new Profesor[5];
        profesores[0] = new Profesor("Karina Rosas Paredes", "71234567", 9001, "Redes");
        profesores[1] = new Profesor("Diego Iquira Becerra", "76543210", 9002, "Prog");
        profesores[2] = new Profesor("Whinders Fernandez Granda", "70112233", 9003, "Fisica");
        int numProfesores = 3;

        SistemaGestion sistema = new SistemaGestion(50, 10);


        sistema.addCurso(new Curso("Lenguajes 3", profesores[1], "Lenguajes"));
        sistema.addCurso(new Curso("Redes I", profesores[0], "Redes"));
        sistema.addCurso(new Curso("Fisica I", profesores[2], "Fisica"));

        int opcion;
        do {
            System.out.println("\n SISTEMA DE CURSOS");
            System.out.println("1  Registrar estudiante");
            System.out.println("2  Inscribir estudiante a curso");
            System.out.println("3  Mostrar cursos disponibles");
            System.out.println("4  Reportes");
            System.out.println("5  Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\n");                
            switch (opcion) {
                case 1 -> sistema.registrarEstudiante();
                case 2 -> sistema.inscribirEstudiante();
                case 3 -> sistema.mostrarCursos();
                case 4 -> sistema.reportes();
                case 5 -> System.out.println("Bye bye");
                default -> System.out.println("vuelva a ingresar la opcion");
            }
        } while (opcion != 5);
    }
}

