package OrangeTech_BackEnd.Sintaxe.src;


/**
 *  <h1>TV</h1>
 *  #TV
 *  #
 *  <p>Classe que possui os metodos das funcoes de uma TV</p>
 *  <b>Funcoes genericas de uma TV</b>
 *  @paran ligada, canal, volume
 *  @method ligar, desligar, aumentarVolume, diminuirVolume, diminuirCanal, aumentarCanal, mudarCanal.
 *  @author: Angelo
 *  @Version: 1.0
 */
public class Tv {
    boolean ligada = false;
    int canal = 1, volume = 25;

    /**
     * <h1>Ligar</h1>
     * <p>Metodo que muda o estado da tv para ligado</p>
     */
    public void ligar(){
        ligada=true;
    }

    /**
     * muda o estado da tv para desligado
     */
    public void desligar(){
        ligada=false;
    }

    /**
     * Aumenta o volume de 1 em 1
     */
    public void aumentarVolume(){
        volume++;
        System.out.println("+Volume: "+volume);
    }

    /**
     * Diminui o volume de 1 em 1
     */
    public void diminuirVolume(){
        volume--;
        System.out.println("-Volume: "+volume);
    }

    /**
     * Diminui o canal de 1 em 1
     */
    public void diminuirCanal(){
        canal--;
        System.out.println("-Canal: "+canal);
    }

    /**
     * Aumenta o canal de 1 em 1
     */
    public void aumentarCanal(){
        canal++;
        System.out.println("+Canal: "+canal);
    }

    /**
     * Muda o canal para o novoCanal selecionado
     * @param novoCanal
     */
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
        System.out.println("Novo Canal: "+novoCanal);
    }


}
