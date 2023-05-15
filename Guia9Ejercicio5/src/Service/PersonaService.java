/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import guia9ejercicio5.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 * 
 *  Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
public class PersonaService {
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    // Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.


   /* public Persona crearPersona() {
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.next());

        System.out.println("Ingrese año de nacimiento");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia de nacimiento");
        int dia = leer.nextInt();
        Date fecha = new Date(anio-1990, mes-1, dia);
        p1.setNac(fecha);
        return new Persona(p1.getNombre(), p1.getNac());
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int calcularEdad(Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear();
        int anio2 = fecha2.getYear();
        int edad = anio2 - anio1;
        return edad;
    }
    

    public void mostrarPersona() {
        Date fechaActual = fechaActual();
        int edad = calcularEdad(p1.getNac(), fechaActual);
        System.out.println("El nombre es: " + p1.getNombre());
        System.out.println("La fecha de nacimiento es: "+ p1.getNac());
        System.out.println("La edad de la persona es: "+ edad);

    }
}*/


Date fechaN;
Persona pesonax =new Persona();
String nombre;
int edad;
public Date crearPersona(){
    System.out.println("Ingrese nombre de la persona:");
    nombre=leer.next();
    System.out.println("Ingrese año de nacimiento");
    int anio = leer.nextInt();
    System.out.println("Ingrese mes de nacimiento");
    int mes = leer.nextInt();
    System.out.println("Ingrese dia de nacimiento en numero");
    int dia = leer.nextInt();
    fechaN = new Date(anio-1900, mes-1, dia);
    return fechaN;
 }
  public Date fechaA() {
        Date fechaA = new Date();
        return fechaA;
    }
  public void calcularEdad(Date fechaA, Date fechaN) {
    edad=(fechaA.getYear() - fechaN.getYear());
    System.out.println("La edad de la persona es:" + edad);

}
  public boolean menorQue(){
     boolean bandera=false;
      if (edad>=18) {
          System.out.println("La persona no es menor de edad.");   
      bandera=true;
      }
      return bandera;
    }
 public void mostrarPersona(){
     System.out.println("El nombre de la persona es:"+nombre+" , "+"la edad es "+ edad);   
 }
}

//main
/*public static void main(String[] args) {
PersonaService p1= new PersonaService();
Date fechaN =p1.crearPersona();
Date fechaA =p1.fechaA();
p1.calcularEdad(fechaA, fechaN);
p1.menorQue();
p1.mostrarPersona();
    }
    
}*/