package Actividad5;

public abstract class cuenta {
    protected String numerocuenta;
    protected double saldo;

    public cuenta(String numerocuenta, double saldo) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }
