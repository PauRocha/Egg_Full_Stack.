/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import guia9ejercicio6.Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class CursoService {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos() {

        // Creamos un arrays para retornar y darle valor al atributo en el metodo siguiente
        String[] curso = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del alumno #" + (i + 1));
            curso[i] = leer.nextLine();
        }

        // Retornamos el array creado en este metodo
        return curso;
    }

    public Curso crearCurso() {
        // Creamos un objeto LOCAL de la clase curso para retornar al main
        Curso c1 = new Curso();

        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(leer.nextLine());

        System.out.println("Ingrese la cantidad de horas por dia del curso:");
        c1.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese cuantos dias a la semana tiene este curso:");
        c1.setCantidadDiasPorSemana(leer.nextInt());

        // Creamos una variable que la utilizaremos en el bucle/menu siguiente
        int opcion;

        do {
            System.out.println("El curso es:");
            System.out.println("1. Turno Mañana");
            System.out.println("2. Turno Tarde");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    c1.setTurno("Mañana");
                    break;
                case 2:
                    c1.setTurno("Tarde");
                    break;
                default:
                    System.out.println("Error! Opcion no válida.");
            }
        } while (opcion != 1 && opcion != 2);

        System.out.println("Ingrese el precio por hora:");
        c1.setPrecioPorHora(leer.nextInt());

        leer.nextLine(); // Para solucionar el error que provoca nextInt con el salto de linea

        // Enviamos el arreglo creado en el método 'cargarAlumnos()' al atributo Alumnos
        c1.setAlumnos(cargarAlumnos());

        // Retornamos el objeto creado en este metodo para guardarlo en el objeto creado en el main
        return c1;
    }

    public void calcularGananciaSemanal(Curso c1) {

        // Calculamos la cantidad de alumnos ingresados en el curso
        String[] vector = c1.getAlumnos();
        int cantidadAlumnos = 0;

        for (int i = 0; i < 5; i++) {
            // En caso que un elemento del array sea nulo o vacio se omite del contador cantidadAlumnos
            if (vector[i] != null && !vector[i].isEmpty()) {
                cantidadAlumnos++;
            }
        }
        // Para obtener ganancia multiplicamos Cantidad de horas por dia, Precio por hora, Cantidad de dias a la semana y la cantidad de alumnos del curso.
        int ganancia = c1.getCantidadHorasPorDia() * c1.getPrecioPorHora() * c1.getCantidadDiasPorSemana() * cantidadAlumnos;

        System.out.println("La ganancia semanal del curso " + c1.getNombreCurso() + " es: " + ganancia);
    }
}