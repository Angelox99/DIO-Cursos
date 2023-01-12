package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numeros {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList( "1" ,"0","4","1","2","3","9","9","6","5");
        System.out.println("Imprima todos os elementos dessa lista de String: ");
//        Normal:
//        numerosAleatorios.stream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//       Lambda:
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de string em uma lista de numeros inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> listParesMaior2 = collectList.stream()
                .filter(i -> (i % 2 == 0) && (i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaior2);

        System.out.println("Mostre a media dos numeros: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent( System.out::println);

        System.out.println("Remova os valores impares: ");
        collectList.removeIf(i -> (i %2 != 0));
        System.out.println(collectList);



    }
}
