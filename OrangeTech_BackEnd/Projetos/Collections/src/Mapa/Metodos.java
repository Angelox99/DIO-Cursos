package Mapa;

import java.util.*;

public class Metodos {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionario que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
           put("gol",14.4);
           put("uno",15.6);
           put("mobi",16.1);
           put("hb20",14.5);
           put("kwid",15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());

        System.out.println("\nConfira se o modelo tucson esta no dicionario: "+ carrosPopulares.containsKey("tucson"));
        System.out.println("Confira se o modelo uno esta no dicionario: "+ carrosPopulares.containsKey("uno"));
        System.out.println("Exiba o terceiro modelo adicionado: "+ carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba os modelos mais e menos economicos e seus consumos: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente=> "+modeloMaisEficiente+"-"+consumoMaisEficiente);
            }

            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente=> "+modeloMenosEficiente+"-"+consumoMenosEficiente);
            }
        }

        System.out.print("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a media dos consumos deste dicionario de carros: "+(soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l: ");
        System.out.println("Antes: "+carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))iterator1.remove();            }
        System.out.println("Depois: "+carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        Map<String, Double> carrosPopulares2 = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println("HashMap=> "+carrosPopulares2.toString());
        System.out.println("LinkedHashMap=> "+carrosPopulares1.toString());

        System.out.println("\nexiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("\nApague o dicionario de carros");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionario esta vazio: "+carrosPopulares.isEmpty());


        System.out.println("\n(0)HashMap(modificado)====>"+carrosPopulares);
        System.out.println("(1)LinkedHashMap==========>"+carrosPopulares1+"(Ordem de Entrada) ");
        System.out.println("(2)HashMap(original)======>"+carrosPopulares2+"(Aleatorio(entre aspas))");
        System.out.println("(3)TreeMap================>"+carrosPopulares3+"(Ordem Natural)");


    }
}
