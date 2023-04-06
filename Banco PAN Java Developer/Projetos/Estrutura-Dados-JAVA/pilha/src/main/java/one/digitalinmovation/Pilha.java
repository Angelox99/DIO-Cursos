package one.digitalinmovation;

public class Pilha {
    private No refNoEntraPilha;

    public Pilha() {
        this.refNoEntraPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntraPilha;
        refNoEntraPilha = novoNo;
        refNoEntraPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()) {
            No noPoped = refNoEntraPilha;
            refNoEntraPilha = refNoEntraPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntraPilha;
    }

    public boolean isEmpty(){
//        if (refNoEntraPilha == null) {
//            return true;
//        }
//            return false;
        return refNoEntraPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String  stringRetorno = "--------------\n";
                stringRetorno+= "         Pilha\n";
                stringRetorno+= "--------------\n";

        No noAuxiliar = refNoEntraPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno +="[No{dado="+ noAuxiliar.getDado()+"}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "--------------\n";
        return stringRetorno;
    }
}
