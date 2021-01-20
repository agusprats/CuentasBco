package adaitw.java;
/*Modelar las cuentas de un banco
Un cliente tiene Cajas de Ahorro y C.Cte en pesos y dolares._
Las ctas ctes admiten descubiertos*/
/*  Pablo "es un" Cliente. // pablo=objeto, Cliente=Clase
    Cliente pablo = new Cliente();
*/
/*  Un Cliente "tiene una" CuentaCorriente.// atributo
    class Cliente{
        private CuentaCorriente cCorriente;
        private Integer dni;
        private String nombre;
    }*/
/*  Una CuentaCorriente "es un tipo de" Cuenta.// superclase
    class CuentaCorriente extends Cuenta{}*/
public class Main {

    public static void main(String[] args) {

        Cliente pablo = new Cliente(50.00);

        CajaDeAhorro cdaPablo = pablo.getcDeAhorro();

        cdaPablo.depositar(100.0);
        cdaPablo.extraer(50.25);
        cdaPablo.depositar(300.50);
        System.out.println(("El saldo es: " +cdaPablo.getSaldo()));
    }
}
