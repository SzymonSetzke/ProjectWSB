package com.company;
public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Szymon";
        me.lastName = "Setzke";
        Animal dog = new Animal("dog");
        dog.name = "Dino";
        dog.feed();
        for (int i = 0; i < 20; i++) {
            dog.Walk();
        }
        dog.feed();
        dog.feed();
        Car dreamcar = new Car("VW", "Passat", 1998);
        me.car = dreamcar;
        me.setSalary(1.0);
    }
}