package edu.unisabana.pizzafactory.model;

public class FabricaPizzaDelgada extends AFabricaPizza {

    @Override
    public AmasadorPizza crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    @Override
    public HorneadorPizza crearHorneador() {
        return new HorneadorPizzaDelgada();
    }

    @Override
    public MoldeadorPizza crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }
}