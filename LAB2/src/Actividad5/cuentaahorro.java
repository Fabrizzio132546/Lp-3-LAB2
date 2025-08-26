package Actividad5;

public class cuentaahorro extends cuenta {
    private double tasainteres;
    private double saldominimo;

    public cuentaahorro(String numerocuenta, double saldo, double tasainteres) {
        super(numerocuenta, saldo);
        this.tasainteres = tasainteres;
        this.saldominimo = saldo;
    }

