package Repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Numero: ");
        numero = scan.nextInt();

        System.out.println("Tabuado do "+ numero);
        for (int i = 1; i <= 10; i++)
            System.out.println(numero+" x "+i+" = "+(numero*i));

    }
}
