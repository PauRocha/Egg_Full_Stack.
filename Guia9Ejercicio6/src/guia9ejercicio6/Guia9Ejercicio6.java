/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio6;

import Service.CursoService;
import guia9ejercicio6.Entidad.Curso;

/**
 *
 * @author Rocha Paula
 */
public class Guia9Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos 2 objetos de la clase Entidades
        Curso c1, c2;
        // Creamos un objeto de la clase Servicios para trabajar los metodos
        CursoService cs = new CursoService();
        
        // Damos los valores del objeto c1 con el retorno del metodo crearCurso
        c1 = cs.crearCurso();
        // Salto de linea para mejorar la visual
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
        
        // Damos los valores del objeto c2 con el retorno del metodo crearCurso
        c2 = cs.crearCurso();
        System.out.println("");
        System.out.println("--------------------------------------");
        System.out.println("");
        
        // Convocamos el motodo para el objeto/curso c1
        cs.calcularGananciaSemanal(c1);
        
        // Convocamos el motodo para el objeto/curso c2
        cs.calcularGananciaSemanal(c2);
        
        
    }
    
    }
    

