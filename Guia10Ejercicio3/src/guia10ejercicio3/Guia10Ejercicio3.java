/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio3;

import Service.AlumnoService;

/**
 *
 * @author Rocha Paula
 */
public class Guia10Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AlumnoService as = new AlumnoService();
        
        as.agregarAlumno();
        as.mostrarAlumnos();
        System.out.println("El promedio de las notas es: " + as.mostrarPromedioAlumno());
        
        
    }
    }
    

