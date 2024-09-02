package org.example;

public class Samsung implements IFabricanteCelular {
    @Override
    public ICelular constroiCelular(String modelo) { //Factory
        if (modelo=="S20"){
            System.out.println("S20 Fabricado com sucesso!!");
            return new GalaxyS20();
        }
        return null;
    }
}
