// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.


import java.io.IOException;
import java.util.Scanner;

public class DIO {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        for (int i =1 ; i<=6; i++) {
            x=leitor.nextDouble();
            if (x > 0) {
                cont++;
                media += x;
            }
    }

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media/cont));
}

}