package org.example;

public class Apple implements IFabricanteCelular {
    @Override
    public ICelular constroiCelular(String modelo) { //Factory
        if (modelo=="iphoneX"){
            System.out.println("iphoneX Fabricado com sucesso!!");
            return new IphoneX();
        }
        return null;
    }
}
