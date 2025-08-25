package Actividad3;

public class Motor {
    private int numMotor;
    private int revPorMin;

    public Motor(int numMotor, int revPorMin) {
        this.setNumMotor(numMotor);
        this.setRevPorMin(revPorMin);
    }

    @Override
    public String toString() {
        return "Número de motor: " + getNumMotor() + ", RPM: " + getRevPorMin();
    }

	private int getRevPorMin() {
		return revPorMin;
	}

	private void setRevPorMin(int revPorMin) {
		this.revPorMin = revPorMin;
	}

	private int getNumMotor() {
		return numMotor;
	}

	private void setNumMotor(int numMotor) {
		this.numMotor = numMotor;
	}
}
