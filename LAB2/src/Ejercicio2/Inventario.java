package Ejercicio2;

public class Inventario {
    private String[] objetos;
    private int limite;
    private int cantidad;

    public Inventario(int limite) {
        this.limite = limite;
        this.objetos = new String[limite];
        this.cantidad = 0;
    }

    public void agregarObjeto(String objeto) {
        if (cantidad < limite) {
            objetos[cantidad] = objeto;
            cantidad++;
            System.out.println("Objeto agregado: " + objeto);
        } else {
            System.out.println("Inventario lleno, no puedes agregar mas objetos.");
        }
    }

    public String mostrarObjetos() {
        if (cantidad == 0) return "Vacío";
        String resultado = "";
        for (int i = 0; i < cantidad; i++) {
            resultado += objetos[i];
            if (i < cantidad - 1) resultado += ", ";
        }
        return resultado;
    }
}