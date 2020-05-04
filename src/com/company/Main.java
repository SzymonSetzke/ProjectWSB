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
        Car dreamcar = new Car("VW", "Passat", 1998);
        me.setSalary(2000.0);
        dreamcar.value = 2000.0;
        me.setCar(dreamcar);
        dreamcar.value = 20000.0;
        me.setCar(dreamcar);
        dreamcar.value = 100000.0;
        me.setCar(dreamcar);
    }
}