public class Stack {
    public static void main(String[] args) {
        System.out.println("\nInicio do main");

        A();

        System.out.println("Finalizou o main");
    }
    static void A(){
        System.out.println("\nEntrou no A()");

        B();

        System.out.println("Finalizou o A()");
    }
    static void B(){
        System.out.println("\nEntrou no B()");

        for (int i = 0; i <= 4; i++) System.out.println(i);
        C();

        System.out.println("Finalizou o B()");
    }
    static void C(){
        System.out.println("\nEntrou no C()");

        Thread.dumpStack();//Le de baixo pra cima
//        D();

        System.out.println("Finalizou o C()");
    }
    static void D(){
        System.out.println("\nEntrou no D()");

        System.out.println("Finalizou o D()");
    }
}