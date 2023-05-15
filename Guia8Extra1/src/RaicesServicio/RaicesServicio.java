/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RaicesServicio;

import guia8extra1.Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author Rocha Paula
 */
public class RaicesServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices raizx = new Raices();

    public Raices valores() {
        System.out.println("Ingrese el valor de A: ");
        raizx.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de B: ");
        raizx.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de C: ");
        raizx.setC(leer.nextDouble());
        return raizx;
    }

    public double getDiscriminante() {
        double discriminantex;
        discriminantex = (Math.pow(raizx.getB(), 2)) - 4 * raizx.getA() * raizx.getC();
        return discriminantex;
    }

    public boolean tieneRaices() {
        boolean condicionx;
        condicionx = getDiscriminante() >= 0;
        return condicionx;
    }

    public boolean tieneRaiz() {
        boolean condicion;
        condicion = getDiscriminante() == 0;
        return condicion;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            //(-b±√((b^2)-(4*a*c)))/(2*a)      

            double sol1 = -(raizx.getB()) + Math.sqrt(Math.pow(raizx.getB(), 2) - (4 * raizx.getA() * raizx.getC())) / (2 * raizx.getA());
            System.out.println("Resultado uno: " + sol1);
            double sol2 = -(raizx.getB()) - Math.sqrt(Math.pow(raizx.getB(), 2) - (4 * raizx.getA() * raizx.getC())) / (2 * raizx.getA());
            System.out.println("Resultado dos: " + sol2);
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double sol3 = -(raizx.getB()) + Math.sqrt(Math.pow(raizx.getB(), 2) - (4 * raizx.getA() * raizx.getC())) / (2 * raizx.getA());
            System.out.println("Resultado posible: " + sol3);
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            System.out.println("tiene dos posibles soluciones: ");
            obtenerRaices();
        } else if (tieneRaiz()) {
            System.out.println("Tiene una solucion: ");
            obtenerRaiz();
        } else {
            System.out.println("No existe solucion");

        }

    }

}

