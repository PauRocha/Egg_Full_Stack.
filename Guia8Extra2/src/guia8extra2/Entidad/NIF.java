/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2.Entidad;

/**
 *
 * @author Rocha Paula
 * 
 *  Dígito Verificador. Crear una clase NIF que se usará para mantener 
     * DNIs con su correspondiente letra (NIF). Los atributos serán el número 
     * de DNI (entero largo) y la letra (String o char) que le corresponde. 
 */
public class NIF {
   
//atributos 
    private Long dni;
    private String letras;
    
//constructor vacio

    public NIF() {
    }

//constructor con parametros

    public NIF(Long dni, String letras) {
        this.dni = dni;
        this.letras = letras;
    }

//seter y geters

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }
    
}
