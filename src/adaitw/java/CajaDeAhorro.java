package adaitw.java;

public class CajaDeAhorro extends Cuenta{

    public CajaDeAhorro(Double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void extraer(Double monto) {
        if(monto<= saldo){
            super.extraer(monto);
        }

    }
}
