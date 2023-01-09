package Mapa;

import java.util.HashMap;
import java.util.Map;

public class Exemplo {
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



    }
}
