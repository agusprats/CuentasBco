package adaitw.java;

public abstract class Cuenta {  //Cuando una clase es abstracta, NO se puede instanciar y llamar al constructor.
    //No se pueden crear objetos a partir de esa clase.
    //Las clases hijas, quedan obligadas a implementar los métodos
    private String moneda;
    protected Double saldo;

    //Constructor
    public Cuenta(Double saldoInicial){
        saldo = saldoInicial;
        moneda = "ARS";
    }

    //Getter
    public Double getSaldo(){
        return saldo;
    }

    //Métodos
    public void depositar(Double monto){
        saldo += monto;
    }
    public void extraer(Double monto){
        saldo -= monto;
    }
}
