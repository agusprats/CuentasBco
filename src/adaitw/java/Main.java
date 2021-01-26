package adaitw.java;

public class Main {

    public static void main(String[] args) {

        ClientePyme sodaSrl = new ClientePyme(1231, 5500.00);
        ClienteEmpresa segurosSa = new ClienteEmpresa(1232, 10000.00);
        ClientePyme miPanSh = new ClientePyme(1234, 5600.00);
        ClienteIndividuo ana = new ClienteIndividuo(1233, 3500.00);
        Cliente pablo = new ClienteIndividuo( 1235, 7000.00); //Aqui estoy haciendo casting
        CajaDeAhorro cdaPablo = pablo.getcDeAhorro();

        cdaPablo.depositar(100.0);
        cdaPablo.extraer(50.25);
        cdaPablo.depositar(300.50);

        System.out.println(("El saldo es: " +cdaPablo.getSaldo()));
        System.out.println("El número de cliente de Ana es: "+ana.getNumeroCliente());
        System.out.println("El número de cliente de Soda Srl es: "+sodaSrl.getNumeroCliente());
        System.out.println("El número de cliente de Mi Pan SH es: "+miPanSh.getNumeroCliente());
        System.out.println("El número de cliente de Seguros SA es: "+segurosSa.getNumeroCliente());

        System.out.println("Empresa no tiene prestamo: "+ClienteEmpresa.getPrestamo());
        System.out.println("El prestamo cliente Seguros S.A. es: "+segurosSa.getPrestamo());

        System.out.println("El prestamo pre aprobado Pyme es: "+ClientePyme.getPrestamo());
        System.out.println("El prestamo cliente Soda SRL es: "+sodaSrl.getPrestamo());

        System.out.println("El prestamo pre aprobado Individuo es: "+ClienteIndividuo.getPrestamo());
        System.out.println("El prestamo cliente Ana es: "+ana.getPrestamo());
        System.out.println("El prestamo cliente Pablo es: "+pablo.getPrestamo());

        //pablo.obtenerPrestamo(monto:350.0);
        //System.out.println("Ahora Pablo tiene: "+cdaPablo.getSaldo())
    }
}



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
    }

Una CuentaCorriente "es un tipo de" Cuenta.// superclase
    class CuentaCorriente extends Cuenta{}

          *** Agregar 3 categorías de clientes: ***
Cliente PYMES, Cliente Empresa y Cliente Individuo.
Las pymes y las empresas tienen razón social y CUIT.
Los clientes individuos tienen nombre y DNI.
Los clientes de todas las categorías tienen número de cliente, cuenta corriente y caja de ahorro.
Todos los clientes pueden consultar su saldo, hacer depósitos y extracciones de sus cuentas.
Los clientes individuo y pymes pueden pedir préstamos.

*/
