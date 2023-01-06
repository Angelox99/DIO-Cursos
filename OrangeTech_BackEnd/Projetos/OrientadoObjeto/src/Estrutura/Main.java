package Estrutura;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("L200");
        carro1.setCapacidadeTanque(60);

        System.out.println("\nModelo: "+ carro1.getModelo());
        System.out.println("Cor: "+ carro1.getCor());
        System.out.println("Capacidade do Tanque: "+ carro1.getCapacidadeTanque());
        System.out.println("Valor do Tanque: "+ carro1.totalValorTanque(7));


        Carro carro2 = new Carro("Branco","Fusca",40);

        System.out.println("\nModelo: "+ carro2.getModelo());
        System.out.println("Cor: "+ carro2.getCor());
        System.out.println("Capacidade do Tanque: "+ carro2.getCapacidadeTanque());
        System.out.println("Valor do Tanque: "+ carro2.totalValorTanque(7));




    }
}
