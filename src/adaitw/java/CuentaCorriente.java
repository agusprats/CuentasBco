package adaitw.java;

public class CuentaCorriente extends Cuenta {

    private static final Double descubierto = 5000.0;

    public CuentaCorriente(Double saldoInicial) {
        super(saldoInicial);
    }

    public static Double getDescubierto(){
        return descubierto;
    }

    @Override
    public void extraer(Double monto) {
        if(monto >= (saldo+descubierto))
            return;
        super.extraer(monto);
    }
}
/*
* saldo =$2000
* descubierto 5mil
* monto 10mil
* */
