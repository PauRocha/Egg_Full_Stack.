/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobusServicio;

import guia8ejercicio1exteaextra.Entidad.Autobus;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class autobusServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Autobus autobus = new Autobus();

    public Autobus crearAutobus() {
        System.out.println("Ingrese la identificacion del autobus: ");
        autobus.setIdentificacion(leer.next());
        System.out.println("Ingrese capacidad maxima del autobus: ");
        autobus.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese la cantidad de paradas: ");
        autobus.setParadas(leer.nextInt());
        return autobus;
    }

    public void inicioRecorrido(int cantPersonas) {

        if (cantPersonas >= autobus.getCapacidadMaxima()) {
            System.out.println("Quedan afuera: " + (cantPersonas - autobus.getCapacidadMaxima() + "pasajeros"));
            System.out.println("No pueden subir mas personas");
            autobus.setCapacidadActual(0);
            //deberia crearse un autobus
        } else {
            autobus.setCapacidadActual(autobus.getCapacidadMaxima() - cantPersonas);
            System.out.println("Quedan " + autobus.getCapacidadActual() + "asientos disponibles");
        }
    }

    public void finRecorrido() {
        autobus.setCapacidadActual(autobus.getCapacidadMaxima());
        System.out.println("Disponibilidad del autobus!: " + (autobus.getCapacidadActual()));
    }

    public void subirPasajeros(int cantPersonas, int parada) {

        if (parada == 1) {
            System.out.println("Inicio del recorrido");

        } else if (parada == autobus.getParadas()) {
            System.out.println("Fin del recorrido");
        } else {
            System.out.println("Cuantas personas estan viajando?: ");
            autobus.setCapacidadActual(autobus.getCapacidadMaxima() - leer.nextInt());
            if (cantPersonas >= autobus.getCapacidadMaxima()) {
                System.out.println("Quedaron afuera: " + (cantPersonas - autobus.getCapacidadMaxima()) + " pasajeros");
                System.out.println("No pueden subir mas personas");
                autobus.setCapacidadActual(0);
            } else {
                autobus.setCapacidadActual(autobus.getCapacidadMaxima() - cantPersonas);
                System.out.println("Quedan " + autobus.getCapacidadActual() + " asientos disponibles");
            }
        }
    }

    public void bajarPasajeros(int cantPersonas, int parada) {
        if (parada == 1) {
            System.out.println("Inicio del recorrido");
        } else if (parada == autobus.getParadas()) {
            System.out.println("Fin de recorrido");
            finRecorrido();
        } else {
            System.out.println("Cuantas personas estan viajando?: ");
            int personasViajando = leer.nextInt();
            if (cantPersonas >= personasViajando) {
                System.out.println("No hay tantos pasajeros para bajar: ");
                autobus.setCapacidadActual(autobus.getCapacidadMaxima());
            } else {
                autobus.setCapacidadActual(autobus.getCapacidadMaxima() - personasViajando + cantPersonas);
                System.out.println("Quedan " + autobus.getCapacidadActual() + " asientos disponibles");
            }

        }
    }
}