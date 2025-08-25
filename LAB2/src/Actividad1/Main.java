package Actividad1;

public class Main {

	public static void main(String[] args) {
		Coche coche1 = new Coche("camaro", 120, 20);
		
		coche1.encender();
		coche1.acelerar();
		coche1.frenar();
		coche1.apagar();
		
		coche1.getModelo();
		coche1.setModelo("Ford");
		coche1.encender();
		
		Coche coche2 = new Coche("Toyota", "JR45", 2025, 123.0);
		coche2.aplicarDescuento();
		
	}

}
