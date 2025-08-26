package Actividad5;

public class cuentacorriente extends cuenta {
    private int retiros;
    private static final int retiros_gratis = 3;
    private static final double costo_retiro = 3.0;

    public cuentacorriente(String numerocuenta, double saldo) {
        super(numerocuenta, saldo);
        this.retiros = 0;
    }
