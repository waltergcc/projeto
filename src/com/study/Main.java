package com.study;

import com.study.facade.Facade;
import com.study.singleton.SingletonEager;
import com.study.singleton.SingletonLazy;
import com.study.singleton.SingletonLazyHolder;
import com.study.strategy.*;

public class Main {

    public static void main(String[] args) {

        // Teste de Design Pattern Singleton
        System.out.println("Teste de Singleton:");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Teste de Design Pattern Strategy
        System.out.println("\nTeste de Strategy:");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Teste de Design Pattern Facade
        System.out.println("\nTeste de Facade:");

        Facade facade = new Facade();
        facade.migrarCliente("Walter","49000000");
    }
}
