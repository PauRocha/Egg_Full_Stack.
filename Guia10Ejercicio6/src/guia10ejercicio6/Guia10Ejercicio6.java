/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio6;

import java.util.HashMap;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;
import service.TiendaService;

/**
 *
 * @author Rocha Paula
 */
public class Guia10Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<String, Double> listaDeProductos = new HashMap<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaService tienda = new TiendaService();

        int opc;
        boolean salir = false;

        System.out.println("-----------------------");
        System.out.println("Buenvenido");
        System.out.println("-----------------------");
        System.out.println("Menu");
        System.out.println("----------------------");

        do {

            System.out.println("Ingrese la opcion deseada: ");
            System.out.println("1- Ingresar Producto");
            System.out.println("2- Modificar Precio");
            System.out.println("3- Eliminar Precio");
            System.out.println("4- Mostrar Lista");
            System.out.println("Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    tienda.ingresarProducto(listaDeProductos);
                    break;
                case 2:
                    tienda.modificarPrecio(listaDeProductos);
                    break;
                case 3:
                    tienda.eliminarPrecio(listaDeProductos);
                    break;
                case 4:
                    tienda.eliminarPrecio(listaDeProductos);
                    break;
                case 5:
                    salir = true;
                    System.out.println("Adios");
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
        } while (!salir);

    }
}
