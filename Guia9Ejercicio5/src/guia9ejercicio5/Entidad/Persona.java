/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio5.Entidad;

import java.util.Date;

/**
 *
 * @author Rocha Paula
 *
 * Implemente la clase Persona en el paquete entidades. Una persona tiene un
 * nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor
 * parametrizado, get y set. Crear una clase PersonaService, en el paquete
 * servicio, con los siguientes métodos: Método crearPersona que pida al usuario
 * Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto
 * Persona creado. Método calcularEdad que calcule la edad del usuario
 * utilizando el atributo de fecha de nacimiento y la fecha actual. Método
 * menorQue recibe como parámetro una Persona y una edad. Retorna true si la
 * persona es menor que la edad consultada o false en caso contrario. Método
 * mostrarPersona que muestra la información de la persona deseada.
 *
 *
 */
public class Persona {

    private String nombre;
    private Date nac;
    
    //constructor vacio
    public Persona() {
    }
    
    //constror con parametros

    public Persona(String nombre, Date nac) {
        this.nombre = nombre;
        this.nac = nac;
    }
    
    //set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNac() {
        return nac;
    }

    public void setNac(Date nac) {
        this.nac = nac;
    }
    
}
