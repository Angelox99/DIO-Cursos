// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Main {

    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            float cont=i;
            h += (1 / cont);
        }

//        TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
//        if (h.2f > 5) h=+0.5;
//        System.out.printf("%.2f", h);
        System.out.println(Math.round(h));
    }
}

//1+(1/2)+(1/3)+(1/4)+(1/5)+(1/6)+(1/7)+(1/8)