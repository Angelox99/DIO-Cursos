package Mapa;

import java.util.*;

public class Ordenacao {
    public static void main(String[] args) {
        System.out.println("\n--\t Ordem Aleatoria:\t--");
        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
           put("Duhigg, Charles", new Livro("O Poder do Habito",408));
           put("harari, Yuval Noah", new Livro("21 Ladroes Para o Seculo 21",432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        } ;

        System.out.println("\n--\t Ordem de Insercao:\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Habito",408));
            put("harari, Yuval Noah", new Livro("21 Ladroes Para o Seculo 21",432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        };

        System.out.println("\n--\t Ordem Alfabetica dos Autores:\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        } ;

        System.out.println("\n--\t Ordem Alfabetica dos Nomes dos Livros:\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey()+" - "+livro.getValue().getNome());
        };

        System.out.println("\n--\t Ordem Numero de Paginas:\t--");
    }
}
class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome=nome;
        this.paginas=paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
