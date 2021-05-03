/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
public class FuncionCorrimiento extends ColaPrioridad {

    public FuncionCorrimiento(int tam) {
        super(tam);
    }

    public boolean insertar(TDA_Prioridad dato) {
        boolean respuesta = super.insertar(dato);
        if (respuesta == true) {
            return respuesta;
        }
        if (ini > 0) {
            corrimiento();
            return super.insertar(dato);
        }
        return false;
    }

    public void corrimiento() {
        int recibe = 0, envia;
        for (envia = ini; envia <= fin; envia++, recibe++) {
            vector[recibe] = vector[envia];
        }
        ini = 0;
        fin = recibe - 1;
    }
}
