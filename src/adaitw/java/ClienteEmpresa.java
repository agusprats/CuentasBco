package adaitw.java;

public class ClienteEmpresa extends Cliente {
    private String razonSocial;
    private Integer cuit;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public ClienteEmpresa(int numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }

}