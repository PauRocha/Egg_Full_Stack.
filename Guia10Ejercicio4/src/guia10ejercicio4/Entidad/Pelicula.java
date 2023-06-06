/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ejercicio4.Entidad;

/**
 *
 * @author Rocha Paula
 */
public class Pelicula {
    private String titulo;
    private Integer duracion;
    private String director;
    
    //constructor vacio

    public Pelicula() {
    }
    
    // constructor con parametros

    public Pelicula(String titulo, Integer duracion, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
    }
    
    // seter y geter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
}
