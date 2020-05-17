package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {

    public FarmAnimal(String species) {
        super(species, 5.0);
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println("Bon Appetit");
    }
}