package adaitw.java;

public class ClientePyme extends Cliente{
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

    public ClientePyme(Integer numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }

}
