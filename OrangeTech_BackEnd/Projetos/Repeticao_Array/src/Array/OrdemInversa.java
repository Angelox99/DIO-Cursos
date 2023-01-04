package Array;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5,6};

        System.out.println("memoria: "+vetor);
        System.out.println("Tamanho: "+vetor.length);

        int i=0;
        System.out.print("Vetor: ");
        while ( i < (vetor.length)){
            System.out.print("["+vetor[i]+"]");
            i++;
        }



        System.out.print("\nVetor Invertido: ");
        for (int j = (vetor.length-1); j >= 0; j--) {
            System.out.print("["+vetor[j]+"]");
        }
//        for (:
//             ) {
//
//        }

    }
}
