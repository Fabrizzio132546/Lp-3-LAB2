package Actividad3;

public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor; 

    public Automovil(String placa, int nPuertas, String marca, String modelo, Motor motor) {
        this.setPlaca(placa);
        this.setNumPuertas(nPuertas);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setMotor(motor); 
    }

    @Override
    public String toString() {
        return "Automóvil: " + getMarca() + " " + getModelo() + "\n" +
               "Placa: " + getPlaca() + "\n" +
               "Número de puertas: " + getNumPuertas() + "\n" +
               "Motor: " + getMotor();
    }

	private Motor getMotor() {
		return motor;
	}

	private void setMotor(Motor motor) {
		this.motor = motor;
	}

	private String getModelo() {
		return modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private int getNumPuertas() {
		return numPuertas;
	}

	private void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	private String getPlaca() {
		return placa;
	}

	private void setPlaca(String placa) {
		this.placa = placa;
	}
}
