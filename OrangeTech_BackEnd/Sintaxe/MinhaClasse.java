package OrangeTech_BackEnd.Sintaxe;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Aprendendo a sintaxe do JAVA!");

        //variaveis com letra minuscula e camelCase
        //variavel
        int ano = 2022;
        ano = 2023;
        //-------------------------------

        //Variaveis com letra maiuscula
        //variavel fixa = constante
        final String BR = "Brasil";
        final int ANO_2000 = 2000;
        //-----------------------------

        String primeiroNome = "Angelo";
        String segundoNome = "Ferro";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);


        /*
        * Variavel clara e direta sem abreviacoes
        * Variavel no singular exceto array
        * Idioma unico sem misturar
        * */

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

        /*
        *
        * */


    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
