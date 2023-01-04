package Repeticao;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int i=0;
        int maior=0;
        int soma=0;

        do {
            System.out.print("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;

            i += 1;
        }while (i < 5);
        System.out.println("\nMaior: " + maior);
        System.out.println("Media: " + (soma/5));


    }
}
