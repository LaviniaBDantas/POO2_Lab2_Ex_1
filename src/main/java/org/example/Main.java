package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Lab2-Atividade-1");
        //A propriedade Singleton está sendo usada aqui, ao chamar o getInstance e obter uma instância unica de fábrica.
        IFabricanteCelular appleFabrica= IFabricaCelularSingleton.getInstance("Apple");
        IFabricanteCelular samsungFabrica= IFabricaCelularSingleton.getInstance("Samsung");

        //A propriedade Factory está sendo usada nesse método, ele é responsável por criar/construir objetos celulares.
        appleFabrica.constroiCelular("iphoneX");
        samsungFabrica.constroiCelular("S20");
    }
}