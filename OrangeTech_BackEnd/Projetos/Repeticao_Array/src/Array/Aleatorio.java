package Array;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        System.out.println("---");

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero :
             numerosAleatorios) {
            System.out.print("[" + (numero) + "]");
        }
        System.out.print("\n---");

        System.out.println("\nSucessores Numeros Aleatorios: ");
        for (int numero :
                numerosAleatorios) {
            System.out.print("[" + (numero+1) + "]");
        }
        System.out.print("\n---");

        System.out.println("\nAntececores Numeros Aleatorios: ");
        for (int numero :
                numerosAleatorios) {
            System.out.print("[" + (numero-1) + "]");
        }
        System.out.print("\n---");

    }
}
