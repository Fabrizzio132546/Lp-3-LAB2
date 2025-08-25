package Actividad2;

public class Contador {
    private int valor;
    private static int acumulador = 0;
    private static final int VALOR_INICIAL = 0;
    private static int nContadores = 0;
    private static int ultimoContador;

    public Contador(int valor) { //contructor principal 
        this.valor = valor;
        Contador.acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }

    public Contador() {
        this(Contador.VALOR_INICIAL);
    }

    public void inc() {
        this.valor++;
        Contador.acumulador++;
    }

    public int getValor() {
        return this.valor;
    }

    public int getAcumulador() {
        return Contador.acumulador;
    }

    public static int getNContadores() {
        return nContadores;
    }

    public static int getUltimoContador() {
        return ultimoContador;
    }
}
