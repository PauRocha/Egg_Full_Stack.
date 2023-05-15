/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1.servicios;

import guia8ejercicio1.Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class CuentaBancariaServicio {
    
    
    Scanner leer= new Scanner(System.in);
    CuentaBancaria cb= new CuentaBancaria();
    
    public void cuentaBancariacrearCuenta(){
        
        System.out.println("ingresar nro de cuenta: ");
        
        cb.setNumeroCuenta(leer.nextInt());
        System.out.println("ingresar nro de dni: ");
        cb.setDniCliente(leer.nextInt());
        System.out.println("pedir saldo actual: ");
        cb.setSaldoActual(leer.nextInt());    
}
public double ingresar(){
    System.out.println("dinero ingresado: ");
    int saldoIngresado= leer.nextInt();
     int SaldoActual= saldoIngresado +cb.getSaldoActual();
     cb.setSaldoActual(SaldoActual);
    return SaldoActual;
    
}
public double retirar(){
     System.out.println("dinero retirado: ");
    int saldoRetirado = leer.nextInt();
     int SaldoActual= cb.getSaldoActual()- saldoRetirado;
     cb.setSaldoActual(SaldoActual);
    return SaldoActual;

}
public int extraccionRapida(){
    System.out.println("ingrese monto para extraccion rapida: ");
    int saldoRapido = leer.nextInt();
    if(saldoRapido < (20*cb.getSaldoActual()/100)) {
         int saldoActual= cb.getSaldoActual()- saldoRapido;
       cb.setSaldoActual(saldoActual); 
    }
    return cb.getSaldoActual();
}
public int  consultarSaldo(){
    return cb.getSaldoActual();
}
public void consultarDatos(){
    System.out.println("numeroCuenta: "+ cb.getNumeroCuenta());
    System.out.println("dni: "+ cb.getDniCliente());
    System.out.println("saldoActual:"+cb.getSaldoActual());

}
}

