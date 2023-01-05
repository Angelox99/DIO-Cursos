package Retorno;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex Retornos: ");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do Quadrado: "+areaQuadrado);

        double areaRetangulo = Quadrilatero.area1(5,5);
        System.out.println("Area do Retangulo: "+areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do Trapezio: "+areaTrapezio);

        float  areaLozango = Quadrilatero.area(5f,5f);
        System.out.println("Area do Lozango: "+areaLozango);
    }
}
