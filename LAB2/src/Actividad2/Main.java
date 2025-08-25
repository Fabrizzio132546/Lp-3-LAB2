package Actividad2;

public class ContadorTest {
	
    public static void main(String[] args) {
        Contador c1 = new Contador(3);
        Contador c2 = new Contador(5);

        c1.inc();
        c2.inc();

        System.out.println("Valor c1: " + c1.getValor());
        System.out.println("Valor c2: " + c2.getValor());
        System.out.println("Acumulador: " + c1.getAcumulador());
    }
}

