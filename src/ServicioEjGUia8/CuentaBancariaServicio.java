package ServicioEjGUia8;

import EntidadGUia8.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);

    public CuentaBancaria CrearUsuario() {
        System.out.println(" Ingrese su NÚmero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println(" Ingrese su NÚmero de DNI");
        long dniCliente = leer.nextLong();
        System.out.println(" Ingrese el saldo de su cuenta");
        double saldoActual = leer.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public double ingresarDinero(CuentaBancaria cb) {

        // si nombro los parámetros  no hace falta poner  : 
        //CuentaBancaria cb = new CuentaBancaria();
        double deposito;
        System.out.println("Ingrese monto a depositar");
        deposito = leer.nextDouble();
        cb.setSaldoActual(deposito + cb.getSaldoActual());
        System.out.println(" El saldo actualizado después del depósito es " + cb.getSaldoActual());

        return cb.getSaldoActual();

    }

    public double retirarDinero(CuentaBancaria cb) {
        //CuentaBancaria cb = new CuentaBancaria();
        double retiro;

        System.out.println("Ingrese monto a retirar");
        retiro = leer.nextDouble();

        if (cb.getSaldoActual() < retiro) {
            System.out.println(" Saldo Insuficiente, ingrese nuevo monto");
            retiro = leer.nextDouble();

         } else {
           
            cb.setSaldoActual(cb.getSaldoActual()-retiro);
            System.out.println(" El saldo actualizado después del depósito es " + cb.getSaldoActual());
        }
        return cb.getSaldoActual();
       
    }

    public double ExtraccionRapida(CuentaBancaria cb) {
        //CuentaBancaria cb = new CuentaBancaria();
        double retiro;
        System.out.println("Ingrese el dinero a retirar");
        retiro = leer.nextDouble();

        if (retiro > 0.20 * cb.getSaldoActual()) {
            System.out.println(" Retiro rechazado");
        } else {
               cb.setSaldoActual(cb.getSaldoActual()-retiro);
         System.out.println(" El saldo actualizado después del depósito es " +cb.getSaldoActual());
        }
        return cb.getSaldoActual();

    }
      public void ConsultaSaldo(CuentaBancaria cb){
          System.out.println("Su Saldo es "+cb.getSaldoActual() );
        }
   
           public void Consultadatos(CuentaBancaria cb){
               System.out.println("Su Nº de cuenta es: " +cb.getNumeroCuenta());
               System.out.println("Su DNI es: "+ cb.getDniCliente());

        }

}
