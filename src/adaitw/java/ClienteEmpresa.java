package adaitw.java;

public class ClienteEmpresa extends Cliente {
    private String razonSocial;
    private Integer cuit;

    public ClienteEmpresa(int numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }
}