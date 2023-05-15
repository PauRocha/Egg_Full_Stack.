/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicioextra2.Entidades;

/**
 *
 * @author Rocha Paula
 */
public class Ahorcado {
     private String[]vecPalabra;
    private int cantidadLetrasEncontradas;
    private int cantidadJugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vecPalabra, int cantidadLetrasEncontradas, int cantidadJugadasMaximas) {
        this.vecPalabra = vecPalabra;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }

    public String[] getVecPalabra() {
        return vecPalabra;
    }

    public void setVecPalabra(String[] vecPalabra) {
        this.vecPalabra = vecPalabra;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJugadasMaximas() {
        return cantidadJugadasMaximas;
    }

    public void setCantidadJugadasMaximas(int cantidadJugadasMaximas) {
        this.cantidadJugadasMaximas = cantidadJugadasMaximas;
    }
}
