/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio1exteaextra.Entidad;

/**
 *
 * @author Rocha Paula
 */
public class Autobus {
   //Asignar atributos
    private String Identificacion;
    private Integer capacidadMaxima;
    private Integer capacidadActual;
    private Integer paradas;
    
    //constructor vacio

    public Autobus() {
    }
    
    //constructor con parametro

    public Autobus(String Identificacion, Integer capacidadMaxima, Integer capacidadActual, Integer paradas, Integer cantPersonas) {
        this.Identificacion = Identificacion;
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        this.paradas = paradas;
      
    }

     //seter y geter
    
    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public Integer getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Integer capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Integer getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(Integer capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Integer getParadas() {
        return paradas;
    }

    public void setParadas(Integer paradas) {
        this.paradas = paradas;
    }
    
}
