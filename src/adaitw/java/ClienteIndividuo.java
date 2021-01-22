package adaitw.java;

public class ClienteIndividuo extends Cliente{
    protected String nombre;
    protected Integer dni;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public ClienteIndividuo(int numeroCliente, Double saldoInicial) {
        super(numeroCliente, saldoInicial);
    }

}
