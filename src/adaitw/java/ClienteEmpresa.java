package adaitw.java;

public class ClienteEmpresa extends Cliente {
    protected String razonSocial;
    protected Integer cuit;

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
/* @Override
    public void getPrestamo(Integer prestamo) {
    System.out.println("No esta permitido dar prestamos para empresas");
    }
*/

