package Actividad4;

public class Main {
    public static void main(String[] args) {
        Persona fabrizzio = new Persona(1, "Fabrizzio", "Ochoa", 12345);
        fabrizzio.getCuenta().setSaldo(2500.75);
        System.out.println(fabrizzio);
    }
}
