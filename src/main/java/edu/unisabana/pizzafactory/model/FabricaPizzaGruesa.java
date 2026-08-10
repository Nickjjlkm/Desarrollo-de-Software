package edu.unisabana.pizzafactory.model;

public class FabricaPizzaGruesa extends AFabricaPizza {

    @Override
    public AmasadorPizza crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public HorneadorPizza crearHorneador() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public MoldeadorPizza crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
}