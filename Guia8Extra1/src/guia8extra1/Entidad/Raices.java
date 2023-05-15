/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra1.Entidad;

/**
 *
 * @author Rocha Paula
 * 
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores 
 * de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
 * llamémosles a, b y c. Hay que insertar estos 3 valores para construir el 
 * objeto a través de un método constructor.
 */
public class Raices {
      double a,b,c;

    public Raices() {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

}
    

