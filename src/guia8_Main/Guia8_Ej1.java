
package guia8_Main;

import EntidadGUia8.CuentaBancaria;
import ServicioEjGUia8.CuentaBancariaServicio;
import java.util.Scanner;


public class Guia8_Ej1 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cb = new CuentaBancariaServicio();
        CuentaBancaria persona1 = cb.CrearUsuario();
       
        cb.ingresarDinero(persona1);
        cb.retirarDinero(persona1);
        cb.ExtraccionRapida(persona1);
        cb.ConsultaSaldo(persona1);
        cb.Consultadatos(persona1);
    }
    
}
