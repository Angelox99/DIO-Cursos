package Metodo;

public class Teste {
    public static void main(String[] args) {
        int i=10;

        fazerAlgo(i);
        System.out.println("i fora: "+i);
    }

    private static void fazerAlgo(int i) {
        i += 10;
        System.out.println("i dentro: "+i);
    }
}
