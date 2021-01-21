package adaitw.java;

public class Cliente {
    private Integer numeroCliente;
    private CajaDeAhorro cDeAhorro;
    private CuentaCorriente cCorriente;
    private ClientePyme cPyme;
    private ClienteEmpresa cEmpresa;
    private ClienteIndividuo cIndividuo;

    //Constructor crea los objetos
    public Cliente(Double saldoInicial){
        cCorriente = new CuentaCorriente(0.00);
        cDeAhorro = new CajaDeAhorro(saldoInicial);
    }

    //Constructor
    public Cliente(ClientePyme cPyme, ClienteEmpresa cEmpresa, ClienteIndividuo cIndividuo) {
        this.cPyme = cPyme;
        this.cEmpresa = cEmpresa;
        this.cIndividuo = cIndividuo;
    }

    //Getters
    public CuentaCorriente getcCorriente() {
        return cCorriente;
    }

    public CajaDeAhorro getcDeAhorro() {
        return cDeAhorro;
    }


}
/*
Agregar 3 categorías de clientes:
Cliente PYMES, Cliente Empresa y Cliente Individuo.ok
Las pymes y las empresas tienen razón social y CUIT.ok
Los clientes individuos tienen nombre y DNI.ok
Los clientes de todas las categorías tienen número de cliente, cuenta corriente y caja de ahorro.ok
Todos los clientes pueden consultar su saldo, hacer depósitos y extracciones de sus cuentas.ok
YAPA: Los clientes individuo y pymes pueden pedir préstamos.
*/