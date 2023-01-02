package OrangeTech_BackEnd.Multiplicacao;

import java.util.Scanner;

public class Multi {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        int A,B,PROD;

        A = ler.nextInt();
        B = ler.nextInt();

        PROD = (A*B);

        System.out.println("PROD = "+PROD);
    }
}

