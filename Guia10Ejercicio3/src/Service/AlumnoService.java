/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import guia10ejercicio3.Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 *
 * Crear una clase llamada Alumno que mantenga información sobre las notas de
 * distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una
 * lista de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos
 * tener un bucle que crea un objeto Alumno. Se pide toda la información al
 * usuario y ese Alumno se guarda en una lista de tipo Alumno y se le pregunta
 * al usuario si quiere crear otro Alumno o no. Después de ese bucle tendremos
 * el siguiente método en el servicio de Alumno: Método notaFinal(): El usuario
 * ingresa el nombre del alumno que quiere calcular su nota final y se lo busca
 * en la lista de Alumnos. Si está en la lista, se llama al método. Dentro del
 * método se usará la lista notas para calcular el promedio final de alumno.
 * Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoService {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    ArrayList <Alumno> listaAlumnos = new ArrayList<>();
    
     public void agregarAlumno() {
        System.out.println("Ingrese los detalles de los alumnos");
        String opcion;
        do {
            Alumno a = new Alumno();            
            System.out.print("Nombre: ");
            a.setNombre(leer.next());
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota " + i + " del alumno:" + a.getNombre());
                int nota = leer.nextInt();
                notas.add(nota);
            }
            a.setNotas(notas);
            listaAlumnos.add(a);            
            System.out.println("Desea ingresar otro alumno?: ");            
            opcion = leer.next();                        
        }while (opcion.equalsIgnoreCase("si"));
    }    
     
     public void mostrarAlumnos() {
        System.out.println("Lista de libros:");
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.getNombre());
            for (Integer notas : alumno.getNotas()){
            System.out.println(notas);
            }            
        }
    }
    
     public double mostrarPromedioAlumno(){
         System.out.println("Nombre del alumno: ");
         String ingreso = leer.next();
         int suma = 0;
         double promedio=0;
        Iterator<Alumno> it = listaAlumnos.iterator();
        while (it.hasNext()){
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(ingreso)){
                
                for (Integer notas : alumno.getNotas()){
                suma+= notas;
            }            
        } 
            promedio = suma/alumno.getNotas().size();
            } 
        
        return promedio;
        }
         
         
         
     }
     
     
     


