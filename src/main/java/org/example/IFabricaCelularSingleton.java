package org.example;

public class IFabricaCelularSingleton {
    private static IFabricanteCelular appleInstance;
    private static IFabricanteCelular samsungInstance;
    public static IFabricanteCelular getInstance(String nomeFabricante){
        if (nomeFabricante=="Samsung"){
            if(samsungInstance==null){
                samsungInstance= new Samsung();
            }
            return samsungInstance;
        }
        if (nomeFabricante=="Apple"){
            if (appleInstance==null){
                appleInstance= new Apple();
            }
            return appleInstance;
        }
        return null;
    }
}
