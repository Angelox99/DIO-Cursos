package OrangeTech_BackEnd.Sintaxe;

public class Usuario {
    public static void main(String[] args) {
        Tv Tv = new Tv();

        System.out.println("Tv Ligada: "+Tv.ligada);

        Tv.ligar();
        System.out.println("Novo Status => Tv Ligada: "+Tv.ligada);
        System.out.println("Canal Atual: "+Tv.canal);
        System.out.println("Volume Atual: "+Tv.volume);

        Tv.diminuirVolume();
        Tv.diminuirVolume();
        Tv.diminuirVolume();

        Tv.aumentarVolume();

        Tv.mudarCanal(13);
        Tv.aumentarCanal();
        Tv.diminuirCanal();
        Tv.diminuirCanal();


    }
}
