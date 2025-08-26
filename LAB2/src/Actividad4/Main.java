package Actividad4;

public class Main {
    public static void main(String[] args) {
        Persona fabrizzio = new Persona(1, "Fabrizzio", "Ochoa", 12345);
        Persona Lizardo = new Persona(2, "Lizardo", "Castillo", 98765);
        fabrizzio.getCuenta().setSaldo(2500.75);
        System.out.println(fabrizzio);
        Lizardo.getCuenta().setSaldo(3462.5);
        System.out.println(Lizardo);
    }
}
