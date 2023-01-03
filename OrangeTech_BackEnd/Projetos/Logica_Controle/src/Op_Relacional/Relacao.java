package Op_Relacional;

public class Relacao {
    public static void main(String[] args) {
        System.out.println("\nTipos de Operadores relacionais: ");
        System.out.println("\nSimilaridade: " +
                                        "igual(==), " +
                                        "diferente(!=)");

        System.out.println("Tamanho: " +
                                    "Maior(>), " +
                                    "Maior igual(>=), " +
                                    "Menor(<), " +
                                    "Menor igual(<=)");

        int i1=10, i2=20;
        float f1=4.5f, f2=3.5f;
        char c1='x', c2='y';
        String s1="Fulano", s2="Fulano", s3="Cicrano";
        boolean b1=true, b2=false;
        long l1=1597L, l2=8997L;
        byte y1=1;
        short h1=25;

//        (i1==i2); (i1!=i2); (i1>i2); (i1<=i2);
//        (f1==f2); (f1!=f2); (f1>f2); (f1<=f2);
//        (c1==c2); (c1!=c2); (c1>c2); (c1<=c2);
//        (s1==s2); (s1!=s2); (s1>s2); (s1<=s2);
//        (b1==b2); (b1!=b2); (b1>b2); (b1<=b2);
        System.out.println("------------------------------------------");

        System.out.println("Inteiro: ");
        System.out.println("I1 == I2: "+(i1==i2));
        System.out.println("I1 != i2: "+(i1!=i2));
        System.out.println("I1  > I2: "+ (i1>i2));
        System.out.println("I1 <= I2: "+(i1<=i2));

        System.out.println("------------------------------------------");

        System.out.println("Float: ");
        System.out.println("F1 == F2: "+(f1==f2));
        System.out.println("F1 != F2: "+(f1!=f2));
        System.out.println("F1  > F2: "+ (f1>f2));
        System.out.println("F1 <= F2: "+(f1<=f2));

        System.out.println("------------------------------------------");

        System.out.println("Char: ");
        System.out.println("C1 == C2: "+(c1==c2));
        System.out.println("C1 != C2: "+(c1!=c2));
        System.out.println("C1  > C2: "+ (c1>c2));
        System.out.println("C1 <= C2: "+(c1<=c2));

        System.out.println("------------------------------------------");

        System.out.println("String: ");
        System.out.println("S1 == S2: "+(s1==s2));
        System.out.println("S1 != S2: "+(s1!=s2));
//        System.out.println("S1  > S2: "+ (s1>s2));
//        System.out.println("S1 <= S2: "+(s1<=s2));

        System.out.println("------------------------------------------");

        System.out.println("Boolean: ");
        System.out.println("B1 == B2: "+(b1==b2));
        System.out.println("B1 != B2: "+(b1!=b2));
//        System.out.println("B1  > B2: "+ (b1>b2));
//        System.out.println("B1 <= B2: "+(b1<=b2));

        System.out.println("------------------------------------------");

        System.out.println("MIX: ");
        System.out.println("L1 == I2: "+(l1==i2));
        System.out.println("L2 >= I1: "+(l2!=i1));
        System.out.println("Y1 != H1: "+ (y1>h1));

        System.out.println("------------------------------------------");
    }
}
