/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio4.Entidad;

/**
 *
 * @author Rocha Paula
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura. La clase incluirá un método para crear el rectángulo 
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular 
 * la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
 * tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 * 
 */
public class rectangulo{
    
       private double base;
    private double altura;

    public rectangulo() {
    }

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void crearRectangulo(double altura, double base){
      
        this.altura= altura;
        this.base =base;
                         
    }
   public double calcularSuperficie() {
       return this.base*this.altura;
       
   }
   public double calcularPerimetro(){
       return (this.base+this.altura)*2;
       
   }
   public void dibujar(){
       for (int i = 0; i < this.altura; i++) {
           System.out.println("");
           for (int j = 0; j < this.base; j++) {
               System.out.print("*");       
           }
       }
       System.out.println("");
   }
}

