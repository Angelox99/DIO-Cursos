package Op_Logico;

public class Logica {
    public static void main(String[] args) {

        System.out.println("\nTipos logicos: ");
        System.out.println("\nConjuncao (e, &&)");
        System.out.println("Disjuncao (ou, ||)");
        System.out.println("Disjuncao exclusiva (xor, ^)");
        System.out.println("Negacao (invercao, !)");

        System.out.println("\nNao sao operadores logicos:");
        System.out.println("\nBitwise (& , |)");
        System.out.println("shift (~, >>, >>>, <<)");

        boolean b1=true, b2=false, b3=true, b4=false;

        System.out.println("---------------------------------------------");

        System.out.println("Conjuncao: ");
        System.out.println("B1 && B2: "+(b1 && b2));
        System.out.println("B1 && B3: "+(b1 && b3));

        System.out.println("---------------------------------------------");

        System.out.println("Disjuncao: ");
        System.out.println("B2 || B3: "+(b1 || b2));
        System.out.println("B2 || B4: "+(b1 || b3));

        System.out.println("---------------------------------------------");

        System.out.println("Disjuncao Exclusiva: ");
        System.out.println("B1 ^ B3: "+(b1 ^ b2));
        System.out.println("B4 ^ B1: "+(b1 ^ b3));

        System.out.println("---------------------------------------------");

        System.out.println("Negacao: ");
        System.out.println("!B1: "+(!b1));
        System.out.println("!B2: "+(!b2));

        System.out.println("---------------------------------------------");

    }
}
