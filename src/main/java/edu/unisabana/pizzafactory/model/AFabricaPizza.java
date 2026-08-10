package edu.unisabana.pizzafactory.model;

public abstract class AFabricaPizza {

    public abstract AmasadorPizza crearAmasador();

    public abstract HorneadorPizza crearHorneador();

    public abstract MoldeadorPizza crearMoldeador();
}