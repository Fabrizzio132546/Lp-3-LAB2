package Actividad2;

public class Contador {
    private int valor;
    static int acumulador = 0;
    
    public Contador(int valor) {
        acumulador += valor;
        this.valor = valor;
    }

    public void inc() {
        valor++;
        acumulador++;
    }

    public int getValor() {
        return valor;
    }

    public int getAcumulador() {
        return acumulador;
    }
}
