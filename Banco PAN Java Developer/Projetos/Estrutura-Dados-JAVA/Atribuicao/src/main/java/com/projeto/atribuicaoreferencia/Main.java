package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 1;
        int b = a;
        System.out.println("int A= " + a + " Int B= " + b);
        a = 2;
        System.out.println("int A= " + a + " Int B= " + b);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("Objeto A= " + objA + " Objeto B= " + objB);
        objA.setNum(2);
        System.out.println("Objeto A= " + objA + " Objeto B= " + objB);

    }
}