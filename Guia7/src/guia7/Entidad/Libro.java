/*
 *Crear una clase llamada Libro que contenga los siguientes 
 * atributos: ISBN, Título, Autor, Número de páginas, y un 
 * constructor con todos los atributos pasados por parámetro 
 * y un constructor vacío. Crear un método para cargar un libro 
 * pidiendo los datos al usuario y luego informar mediante otro 
 * método el número de ISBN, el título, el autor del libro y el
 * número de páginas.
 */
package guia7.Entidad;

import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class Libro {
     public int ISBN;
    public String titulo;
    public String autor;
    public int numeroDePaginas;
    
    public Libro(int  ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePagina;

}
    public Libro() {  
    }
        public void cargarLibro() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el ISBN del libro: ");
        this.ISBN = scanner.nextInt();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.next();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.next();
        System.out.print("Ingrese el número de páginas del libro: ");
        this. numeroDePaginas= scanner.nextInt();
    }
        
 public void mostrarLibro() {
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroDePaginas);
}
}
