import java.util.Locale;
import java.util.Scanner;

public class SobreMin {
    public static void main(String[] args) {
        /*
        * Atribui os paramentros antes de executar o progama
        * */
//        String nome = args[0];
//        String sobreNome = args[1];
//        int idade = Integer.valueOf(args[2]);
//        double altura = Double.valueOf(args[3]);


        /*
        * Atribui os parametros depois de executar o programa
        * via scanner
        * */
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Digite seu nome: ");
        String nome =scan.next();

        System.out.print("Digite seu sobrenome: ");
        String sobreNome = scan.next();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        //Imprime os parametros
        System.out.println("----------------------------------");
        System.out.println("Ola, me chamo: "+nome+" "+sobreNome);
        System.out.println("Tenho: "+idade+" anos");
        System.out.println("Minha altura e: "+altura+" cm");



    }
}
