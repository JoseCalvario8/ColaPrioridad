/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class ColaPrioridad {

    protected TDA_Prioridad[] vector;
    protected int ini, fin;

    public ColaPrioridad(int tam) {
        vector = new TDA_Prioridad[tam];
        ini = fin = -1;
    }

    public boolean insertar(TDA_Prioridad dato) {
        if (hayColaLlena()) {
            return false;
        }
        fin++;
        vector[fin] = dato;
        if (ini == -1) {
            ini++;
        }
        if (fin >= 1) {
            ajuste(dato);
        }
        return true;
    }

    public boolean hayColaLlena() {
        return fin == vector.length - 1;
    }

    public void ajuste(TDA_Prioridad dato) {
        TDA_Prioridad tem;
        for (int i = fin - 1; i >= 0; i--) {
            if (dato.getNivel() > vector[i].getNivel()) {
                tem = vector[i];
                vector[i] = dato;
                vector[i + 1] = tem;
            }
        }
    }

    public boolean eliminar() {
        if (estaColaVacia()) {
            return false;
        }
        if (HayUnSoloDato()) {
            ini = fin = -1;
            return true;
        }
        ini++;
        return true;
    }

    public boolean estaColaVacia() {
        return ini == -1 && fin == -1;
    }

    public boolean HayUnSoloDato() {
        return ini == fin;
    }

    public int getINI() {
        return ini;
    }

    public int getFIN() {
        return fin;
    }

    public TDA_Prioridad getValor(int pos) {
        return vector[pos];
    }
}
