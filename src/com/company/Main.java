package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();

        Animal dog = new Animal("dog");
        dog.name = "Dino";

        dog.feed();

        for (int i = 0; i < 12; i++) {
            dog.Walk();
        }
        dog.feed();

        Car dreamcar = new Car("VW", "Passat", 1998);
        me.dreamcar = dreamcar;

    }
}
