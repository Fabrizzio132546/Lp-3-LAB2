package Ejercicio1;

public class Profesor extends Persona { //clase profesor que hereda de perosna 
    private String especialidad;  //atributo propio para profesor 
    public static final int MaxCurso = 3; //numero maximo de cursos que dicta 

    public Profesor(String n, String d, int c, String esp) { //constructor 
        super(n, d, c);  // es del constructor persona 
        this.especialidad = esp;
    }

    @Override
    public void info() { //implementa metodo abstracto info() de persona 
        System.out.println("Profesor: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Especialidad: " + especialidad  + "\n" );
    }

    public String getEsp() { return especialidad; } //devuelve la especialidad  de profesor 
}
