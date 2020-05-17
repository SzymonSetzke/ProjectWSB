package com.company.creatures;

import com.company.Salleable;

abstract public class Animal implements Salleable, Feedable {
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 30.0;
    final String species;
    public String name;
    protected Double weight;

    public Animal(String species) {
        String spec;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                spec = species;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                spec = species;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                spec = species;
                break;
            default:
                this.weight = 0.0;
                spec = "none";
        }
        this.species = spec;
    }

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }
    public void feed() {
        feed(1.0);
    }
    public void feed(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("he is dead");
        } else {
            weight++;
            weight += foodWeight;
            System.out.println(" thanks, he weight " + this.weight);
        }
    }
    public void Walk() {
        if (weight > 0) {
            weight--;
            if (weight <= 0) {
                weight = 0.0;
                System.out.println(name + " was walking and now he is dead");
            } else {

                System.out.println(name + " is walking. His weight is now " + weight);
            }
        } else {
            weight = 0.0;
            System.out.println(name + " can't walk. He is dead.");
        }

    }
    public String toString() {
        return name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            buyer.pet = this;
            if (seller.pet == this) {
                seller.pet = null;
            }
            if (this instanceof Human) {
                throw new Exception("no way");
            } else
                System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("sorry, you have not enough money");
        }
    }
}