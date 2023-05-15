/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import guia8ejercicio3.Entidad.Persona;
import java.util.Scanner;

/**
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
 * Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano. Metodo crearPersona(): el método crear persona, le pide
 * los valores de los atributos al usuario y después se le asignan a sus
 * respectivos atributos para llenar el objeto Persona. Además, comprueba que el
 * sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
 * deberá mostrar un mensaje
 *
 *
 * Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que
 * 20, significa que la persona está por debajo de su peso ideal y la función
 * devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
 * (incluidos), significa que la persona está en su peso ideal y la función
 * devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor
 * que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos de tipo
 * Persona con distintos valores, a continuación, llamaremos todos los métodos
 * para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
 * sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad. Por último, guardaremos los resultados de los
 * métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), para
 * después calcular un porcentaje de esas 4 personas cuantas están por debajo de
 * su peso, cuantas en su peso ideal y cuantos, por encima, y también
 * calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 * Para esto, podemos crear unos métodos adicionales.
 *
 */
public class PersonaServicio {

 private Scanner leer = new Scanner(System.in).useDelimiter("\n");
 Persona personax = new Persona();
 
    public Persona crearPersona() {
        System.out.println("Ingrese el nombre de la persona : ");
        personax.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona: ");
        personax.setEdad(leer.nextInt());
        String aux;
        do {
            System.out.println("Ingrese el sexo (H,M u O): ");
            aux = leer.next().toUpperCase();
            if (aux.equals("H") || aux.equals("M") || aux.equals("O")) {
                personax.setSexo(aux);
            } else {
                System.out.println("Sexo no valido");
            }
        } while (!aux.equals("H") && !aux.equals("M") && !aux.equals("O"));
        System.out.println("Ingrese peso");
        personax.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        personax.setAltura(leer.nextDouble());
        return personax;
    }
    public boolean MayorDeEdad() {
        return personax.getEdad() >= 18;
    }
    public int calcularIMC() {
        int condicion;
        double IMC = (personax.getPeso() / Math.pow(personax.getAltura(), 2));
        if (IMC < 20) {
            condicion = -1;
        } else if (IMC > 26) {
            condicion = 1;
        } else {
            condicion = 0;
        }
        return condicion;

    }
  }