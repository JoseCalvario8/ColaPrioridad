/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class TDA_Prioridad {

    private char dato;
    private int nivel;

    public TDA_Prioridad() {

    }

    public TDA_Prioridad(char dato, int nivel) {
        this.dato = dato;
        this.nivel = nivel;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public char getDato() {
        return dato;
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return dato + "," + nivel;
    }
}
