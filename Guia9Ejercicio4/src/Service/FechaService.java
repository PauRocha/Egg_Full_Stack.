/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class FechaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   
    //Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
   // El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
    public static Date fechaDeNacimiento(){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el año de su nacimiento:");
        int anio = sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (1-12):");
        int mes = sc.nextInt() - 1; // se resta 1 para ajustar el índice del mes a partir de 0
        System.out.println("Ingrese el día de su nacimiento:");
        int dia = sc.nextInt();
        sc.close();
        Date fecha = new Date(anio, mes, dia);
        return fecha;
    }
    
     //Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
    //El método debe retornar el objeto Date.
    public static Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    
     //Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
    //Si necesiten acá tienen más información en clase Date: Documentacion Oracle
    public static int diferencia(Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear();
        int anio2 = fecha2.getYear();
        int edad = anio2 - anio1;
        return edad;
    }

      
    
    
   
}
