package one.digitalInnovation;

import javax.swing.plaf.PanelUI;

public class Fila {
    private No refNoEntraFila;

    public Fila() {
        this.refNoEntraFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setRefNo(refNoEntraFila);
        refNoEntraFila = novoNo;
    }

    public No first(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntraFila;
            while (true){
                if (primeiroNo.getRefNo() != null) {
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue(){
        if (!this.isEmpty()){
            No primeiroNo = refNoEntraFila;
            No noAuxiliar = refNoEntraFila;
            while (true){
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntraFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No noAuxiliar = refNoEntraFila;
        if (refNoEntraFila != null) {
            while (true){
                stringRetorno += "[No{objeto = "+noAuxiliar.getObject()+"}]-->";
                noAuxiliar = noAuxiliar.getRefNo();

                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                }else {
                    stringRetorno += "NULL";
                    break;
                }
            }
        }else {
            stringRetorno = "NULL";
        }

        return stringRetorno;
    }
}
