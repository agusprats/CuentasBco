package adaitw.java;

public class ClienteEmpresa extends Cliente {
    private String razonSocial;
    private Integer cuit;
    private static int prestamo = 0;

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

    public ClienteEmpresa(Integer numeroCliente, Double saldoInicial ) {
        super(numeroCliente, saldoInicial);
    }

    public static int getPrestamo() {
        return prestamo;
    }

    public static void setPrestamo(int prestamo) {
        ClienteEmpresa.prestamo = prestamo;
    }

}
/* @Override
    public void getPrestamo(Integer prestamo) {
    System.out.println("No esta permitido dar prestamos para empresas");
    }
*/

