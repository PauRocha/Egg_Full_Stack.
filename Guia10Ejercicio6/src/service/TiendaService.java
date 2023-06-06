/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 *
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los
 * distintos productos que venderemos y el precio que tendrán. Además, se
 * necesita que la aplicación cuente con las funciones básicas. Estas las
 * realizaremos en el servicio. Como, introducir un elemento, modificar su
 * precio, eliminar un producto y mostrar los productos que tenemos con su
 * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto
 * y de valor el precio. Realizar un menú para lograr todas las acciones
 * previamente mencionadas.
 */
public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public HashMap ingresarProducto(HashMap<String, Double>listaDeProductos){
       
        String producto;
        Double precio;
        
            System.out.println("Ingrese un producto:");
            producto=leer.next();
            System.out.println("Ingrese el precio del producto:");
            precio= leer.nextDouble();
            
            listaDeProductos.put(producto, precio);
            
        return listaDeProductos;

    }
    
    public void modificarPrecio(HashMap<String, Double> listaDeProductos){
        
        String producto;
        Double precio;
        Boolean aux = false;
        
        System.out.println("Ingrese el producto a modificar:");
        producto= leer.next();
        
        for(Map.Entry<String, Double> entrada : listaDeProductos.entrySet()){
            if (entrada.getKey().equalsIgnoreCase(producto)) {
                System.err.println("Ingrese el nuevo Precio:");
                precio= leer.nextDouble();
                entrada.setValue(precio);
                break;
            }else{
               aux=true;
            }
            
            if (aux) {
                System.out.println("El producto ingresado en la lista de productos" + producto + "NO se ha encontrado"); 
            }
            
        }
        
    }
    
    public void eliminarPrecio(HashMap<String, Double> listaDeProductos){
        String producto;
        
        System.out.println("Ingrese el producto que desea borrar:");
        producto= leer.next();
        
        if(listaDeProductos.containsKey(producto)){
            listaDeProductos.remove(producto);
        }else{
            System.out.println("El producto ingresado no se encuentra en la lista de productos");
        }
    }
    
    public void mostrarLista(HashMap<String, Double> listaDeProductos){
        System.out.println(listaDeProductos);
         for(Map.Entry<String, Double> entrada : listaDeProductos.entrySet()){
             System.out.println("Producto: "+entrada.getKey());
             System.out.println("El Precio es: "+entrada.getKey());
         }
    }
}
