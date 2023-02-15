package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //SINGLETON
        //Testes relacionados ao Design Pattern Singleton:
        //LAZY
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        //EAGER
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);
        //LAZYHOLDER
        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstance();
        System.out.println(lazyholder);

        System.out.println();

        //STRATEGY
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        System.out.println();

        //FACADE
        Facade facade = new Facade();
        facade.migrarCliente("Angelo","69312999");
    }
}
