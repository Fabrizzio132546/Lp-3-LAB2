
package Actividad1;

public class Coche {
    // Atributos
    public String color;
    private String modelo;
    private int velocidadMaxima;
    private int potenciaMotor;
    private boolean enMarcha;
    public String marca;
    public int aniofabricacion;
    public Double precio;
    
    public String getModelo() {
    	return modelo;
    }
    
    public void setModelo(String modelo) {
    	this.modelo = modelo;
    }

    // Constructor
    public Coche(String modelo, int velocidadMaxima, int potenciaMotor) {
        this.modelo = modelo;
        this.setVelocidadMaxima(velocidadMaxima);
        this.potenciaMotor = potenciaMotor;
        this.enMarcha = false; // El coche comienza apagado
    }

    // Métodos
    public void acelerar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está acelerando.");
        } else {
            System.out.println("Primero enciende el coche.");
        }
    }

    public void frenar() {
        if (enMarcha) {
            System.out.println("El coche " + modelo + " está frenando.");
        } else {
            System.out.println("El coche está apagado, no se puede frenar.");
        }
    }

    public void encender() {
        enMarcha = true;
        System.out.println("El coche " + modelo + " se ha encendido.");
    }

    public void apagar() {
        enMarcha = false;
        System.out.println("El coche " + modelo + " se ha apagado.");
    }

	private int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	private void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	
	public void aplicarDescuento() {
		double descuento = 0.0;
		if (aniofabricacion < 2010) {
			precio = precio - precio * 0.2;
			System.out.println("Se aplico un descuento del 20 porciento: " + precio);
		} else {
			System.out.println("No se aplico ningun descuento: " + precio);
		}
	}
	
	public Coche() {
		this.modelo = "";
		this.color = "";
		this.velocidadMaxima = 0;
		this.potenciaMotor = 0;
		this.enMarcha = false;
		this.marca = "";
		this.aniofabricacion = 0;
		this.precio = 0.0;
	}
	
	public Coche(String marca, String modelo, int aniofabricacion, double precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.aniofabricacion = aniofabricacion;
		this.precio = precio;
	}

}
