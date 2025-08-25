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

        Contador c3 = new Contador(); //nuevosxd
        System.out.println("Valor c3 (constructor por defecto): " + c3.getValor());

        System.out.println("Número de contadores creados: " + Contador.getNContadores());
        System.out.println("Valor inicial del último contador: " + Contador.getUltimoContador());
    }
}




