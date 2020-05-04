package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Dino";

        dog.feed();

        for (int i = 0; i < 12; i++) {
            dog.Walk();
        }
        dog.feed();
    }
}
