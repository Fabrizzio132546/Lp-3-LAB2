package Actividad5;

public class cuentaahorro extends cuenta { 
    private double tasainteres;
    private double saldominimo;

    public cuentaahorro(String numerocuenta, double saldo, double tasainteres) {
        super(numerocuenta, saldo);
        this.tasainteres = tasainteres; //uso de this
        this.saldominimo = saldo;
    }
    
    @Override 
    public void retirar(double monto) { 
        super.retirar(monto);
        if (saldo < saldominimo) {
            saldominimo = saldo;
        }
    }

    @Override
    public void consultar() {
        double interes = saldominimo * tasainteres;
        depositar(interes);
        saldominimo = saldo;
    }
}
