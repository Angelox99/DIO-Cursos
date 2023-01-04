package Repeticao;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumero;
        int numero;
        int quantPar=0, quantImpar=0;

        System.out.print("Quantidade de numeros: ");
        quantNumero = scan.nextInt();

        int i=0;
        do {
            System.out.print("Numero: ");
            numero = scan.nextInt();

            if (numero %2 == 0) quantPar++;
                else quantImpar++;

            i++;
        }while (i < quantNumero);
        System.out.println("\nQuantidade Par: "+quantPar);
        System.out.println("Quantidade Impar: "+quantImpar);
    }
}
