/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFService;

import guia8extra2.Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula En NIFService se dispondrá de los siguientes métodos:
 * Métodos getters y setters para el número de DNI y la letra. Método
 * crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
 * corresponderá. Una vez calculado, le asigna la letra que le corresponde según
 * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la
 * letra en mayúscula; por ejemplo: 00395469-F). La letra correspondiente al
 * dígito verificador se calculará a traves de un método que funciona de la
 * siguiente manera: Para calcular la letra se toma el resto de dividir el
 * número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El
 * método debe buscar en un array (vector) de caracteres la posición que
 * corresponda al resto de la división para obtener la letra correspondiente. La
 * tabla de caracteres es la siguiente:
 *
 */
public class NIFService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF dni = new NIF();

//le pide al usuario el dni y con ese dni calcula la letra que le correspondera.  
    public void crearNif() {
        System.out.println("Ingrese su numero de DNI");
        dni.setDni(leer.nextLong());
        
        String[] vectorTabla = new String[23];
        System.out.println("Llenar tabla ingrese los datos");
        
        for (int i = 0; i < 23; i++) {
            vectorTabla[i] = leer.next().toUpperCase();
        }

        // Una vez calculado, le asigna la letra que le corresponde según Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra 
//en mayúscula; por ejemplo: 00395469-F).
        String letra = "";
        Integer indice;
        indice = (int) (dni.getDni() % 23);
        
        if (indice >= 0 && indice <= 22) {
            letra = vectorTabla[indice];
        } else {
            System.out.println("El DNI es incorrecto");
           
        } dni.setLetras(letra);
    }

    public void mostrar() {
        System.out.println("El NIF consultado es:"+String.format("%08d",dni.getDni())+ "-" + dni.getLetras());
    }
}
