package com.projetono;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n");

        no<String> no1 = new no<>("conteudo no1");

        no<String> no2 = new no<>("conteudo no2");
        no1.setProximoNo(no2);

        no<String> no3 = new no<>("conteudo no3");
        no2.setProximoNo(no3);

        no<String> no4 = new no<>("conteudo no4");
        no3.setProximoNo(no4);

        //no1->no2->no3->no4->null

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("\n");

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}