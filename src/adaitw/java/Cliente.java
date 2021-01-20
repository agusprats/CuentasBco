package adaitw.java;

public class Cliente {
    private CuentaCorriente cCorriente;
    private CajaDeAhorro cDeAhorro;

    public Cliente(Double saldoInicial){
        this.cCorriente = new CuentaCorriente(0.00);
        this.cDeAhorro = new CajaDeAhorro(saldoInicial);
    };

    //Getters
    public CuentaCorriente getcCorriente() {
        return cCorriente;
    }

    public CajaDeAhorro getcDeAhorro() {
        return cDeAhorro;
    }


}
