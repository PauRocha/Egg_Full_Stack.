/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ejercicio3.Entidad;

/**
 *
 * @author Rocha Paula
 * 
 * Realizar una clase llamada Persona en el paquete de entidades que tengan los 
     * siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), 
     * peso y altura. Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
 */
public class Persona {
    
    //colocar los atributos
    private String nombre;
    private Integer edad;
    private String sexo;
    private Double peso;
    private Double altura;
    
    //contructor vacio

    public Persona() {
    }
    
     //contructor con parametros

    public Persona(String nombre, Integer edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

     //geter y seter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

      @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
}

