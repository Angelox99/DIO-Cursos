package Repeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, multi=1;

        System.out.print("Numero: ");
        numero = scan.nextInt();

        for (int i = numero; i > 0; i--) {
            multi *= i;
        }
        System.out.print(numero+"! = "+multi);

    }
}
