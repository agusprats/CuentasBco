package adaitw.java;

public class ClientePyme extends Cliente{
    private String razonSocial;
    private Integer cuit;

    public ClientePyme(int numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }
}
