package Relacoes;

import java.util.Random;

public class Each {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("1 = "+random);

        int[] NumerosInteiros = new int[100];
        System.out.println("2 = "+NumerosInteiros.length);

        for (int i = 0; i < NumerosInteiros.length; i++) {
            System.out.println(i);
            NumerosInteiros[i]= random.nextInt(10);
            System.out.println("[i]= "+NumerosInteiros[i]);
        }


        int cont=0;
        for (int numeros : NumerosInteiros) {
            if ( numeros == 9) {
                break;
            }
            else {
                cont++;
            }
        }
        System.out.println("Numero de vezes que andou no vetor: "+cont);
    }
}
