package adaitw.java;

public class ClienteIndividuo extends Cliente{
    private String nombre;
    private Integer dni;

    public ClienteIndividuo(int numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }
}
