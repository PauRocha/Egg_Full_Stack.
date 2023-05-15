/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenaServicio;

import guia9ejercicio1.Entidades.Cadena;

/**
 *
 * @author Rocha Paula
 * 
 *  Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.

 */
public class cadenaServicio {
   private final Cadena cadena;
  
  public cadenaServicio() {
      this.cadena = new Cadena();
  }
  
  public cadenaServicio(String frase) {
      this.cadena = new Cadena(frase);
  }
  
  public void setFrase(String frase){
      cadena.setFrase(frase);
      cadena.setLongitud(frase.length());
  }
  public String getFrase() {
      return cadena.getFrase();
  }
  public int getLongitud(){
      return cadena.getLongitud();
  }
  
  
  public int mostrarVocales(Cadena cadena) {
      String frase = cadena.getFrase();
      int contador = 0;
      for(int i = 0; i < frase.length(); i++) {
          char letra = frase.charAt(i);
          if(letra == 'a' || letra == 'e' || letra == 'i' || letra == '0' || letra == 'u') {
              contador++;
          }
      }
      return contador;
  }
  public String invertirFrase() {
      String frase = cadena.getFrase();
      String fraseInvertida = "";
      for(int i = frase.length() - 1; i >= 0; i--) {
          fraseInvertida += frase.charAt(i);
      }
      return fraseInvertida;
  }
  public int vecesRepetido(String letra) {
      String frase = cadena.getFrase();
      int contador = 0;
      for(int i= 0; i < frase.length(); i++) {
          if(Character.toString(frase.charAt(i)).equalsIgnoreCase(letra)){
              contador++;
          }
                
      }
      return contador;
  }
  public int compararLongitud(String frase) {
      return cadena.getFrase().length() - frase.length();
  }
  public String unirFrases(String frase) {
      return cadena.getFrase() + "" + frase;
  }
  public String reemplazar(String letra, String reemplazo) {
      String frase = cadena.getFrase();
      return frase.replace(letra, reemplazo);
  }
  
  public boolean contiene(String letra) {
      String frase = cadena.getFrase();
      return frase.contains(letra);
  }
}