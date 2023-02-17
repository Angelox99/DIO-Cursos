// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.
// - O método .split() quebra uma String em várias substrings a partir de um caracter definido por você e coloca em um array.

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
//        String[] array = new String[3];

        String[] array = frase.split("/");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        var imovel = System.out.printf("Imovel: " + array[1] + "R$" + array[2] + array[3]);

//        for (String s : frase.split("/")) {
//            System.out.println(s);
//        }
    }
}