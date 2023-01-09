package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class Crime {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \tPerguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scanner.next();
        respostas.add(resposta.toUpperCase());
        System.out.print("Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toUpperCase());
        System.out.print("Mora perto da vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toUpperCase());
        System.out.print("Devia para vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toUpperCase());
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toUpperCase());

        System.out.println("\n\t"+respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println("\t>> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println("\t>> CÚMPLICE <<"); break;
            case 5:
                System.out.println("\t>> ASSASSINO <<"); break;
            default:
                System.out.println("\t>> INOCENTE <<"); break;
        }
    }
}