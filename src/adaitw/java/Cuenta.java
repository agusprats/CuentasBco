package adaitw.java;

public class Cuenta {
    private String moneda;
    private Double saldo;

    //Constructor
    public Cuenta(Double saldoInicial){
        saldo = saldoInicial;
        moneda = "ARS";
    }

    public Double getSaldo(){
        return saldo;
    }

    public void depositar(Double monto){
        saldo += monto;
    }
    public void extraer(Double monto){
        saldo -= monto;
    }
}
