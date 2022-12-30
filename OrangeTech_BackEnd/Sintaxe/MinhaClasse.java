package OrangeTech_BackEnd.Sintaxe;

public class MinhaClasse {
    public static void main(String[] args) {
            System.out.println("Aprendendo a sintaxe do JAVA!");

            //---------------------------------------------------------------------------------------------

            System.out.println("Variaveis (camelCase):");
            int ano = 2022;
            ano = 2023;

            //---------------------------------------------------------------------------------------------

            System.out.println("Variaveis finais(MAIUSCULA) = Constantes:");
            final String BR = "Brasil";
            final int ANO_2000 = 2000;

            //---------------------------------------------------------------------------------------------

            System.out.println("Nome Completo:");
            String primeiroNome = "Angelo";
            String segundoNome = "Ferro";

            String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
            System.out.println(nomeCompleto);

            //---------------------------------------------------------------------------------------------

            /*
            * Variavel clara e direta sem abreviacoes
            * Variavel no singular exceto array
            * Idioma unico sem misturar
            * */

            //---------------------------------------------------------------------------------------------

            /*
            * Tipos primitivos:
            * int
            * byte
            * short
            * long = L no final
            * float = F no final
            * double
            * boolean
            * char
            * */

            //---------------------------------------------------------------------------------------------

            System.out.println("Inversao e decremento direto:");
            int numero = 9;
            numero = - numero; // muda o numero pra negativo
            numero = numero * -1; // muda o numero pra positvo
            System.out.println(++numero);//printa incrementando
            System.out.println(--numero);//printa decrementando

            boolean p = true;
            System.out.println(!p);//printa negado mas somente nessa linha
            p = !p; // negado a partir dessa linha

            //---------------------------------------------------------------------------------------------

            System.out.println("if ternario ");
            int a,b;
            a=5;b=6;
            String resultado = (a==b) ? "verdadeiro" : "falso";
            System.out.println(resultado);

            //---------------------------------------------------------------------------------------------

            System.out.println("Comparativos:");
            int x = 2, y = 5;
            boolean z;
            System.out.println(z = (x==y));// comparativo de variaveis

            String nomeUm = "Angelo";
            String nomeDois = new String("Angelo");
            System.out.println(nomeUm.equals(nomeDois));//Comparativo de objetos

            //--------------------------------------------------------------------------------------------






    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
