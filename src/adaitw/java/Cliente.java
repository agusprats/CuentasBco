package adaitw.java;

public class Cliente {
    private Integer numeroCliente;
    private CajaDeAhorro cDeAhorro;
    private CuentaCorriente cCorriente;
    private ClientePyme cPyme;
    private ClienteEmpresa cEmpresa;
    private ClienteIndividuo cIndividuo;
    private static Integer prestamo = 30000;

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
    //Constructor
    public Cliente(Integer numeroCliente, Double saldoInicial) {
        this.numeroCliente = numeroCliente;
    }
    //Constructor
    public Cliente(int prestamo) {
        this.prestamo = prestamo;
    }

    //Getters
    public CuentaCorriente getcCorriente() {
        return cCorriente;
    }
    public CajaDeAhorro getcDeAhorro() {
        return cDeAhorro;
    }
    public Integer getNumeroCliente() {
        return numeroCliente;
    }
    public static Integer getPrestamo(){
        return prestamo;
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