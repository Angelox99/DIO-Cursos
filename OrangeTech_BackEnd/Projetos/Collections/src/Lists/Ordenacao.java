package Lists;

/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jonne", 9, "preto"));
            add(new Gato("Jonne", 10, "amarelo"));
            add(new Gato("Bruno", 18, "amarelo"));
            add(new Gato("Lucas", 18, "tigrado"));
            add(new Gato("Ferri", 9, "tigrado"));
            add(new Gato("Simba", 10, "tigrado"));
            add(new Gato("Simba", 10, "tigrado"));
        }};
        meusGatos.sort(Comparator.comparing(Gato::getNome));


        System.out.println("\n\t--------- Ordem de Inserção ---------");
        System.out.println(meusGatos);

        System.out.println("\n\t---------\tOrdem aleatória\t---------");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n\t---------\tOrdem Natural (Nome)\t---------");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\n\t---------\tOrdem Idade\t---------");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("\n\t---------\tOrdem cor\t---------");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\n\t---------\tOrdem Nome/Cor/Idade\t---------");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "\n{" +
                "nome = " + nome  +
                " / idade = " + idade +
                " / cor = " + cor +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}