package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Szymon";
        me.lastName = "Setzke";
        Animal dog = new Animal("dog");
        dog.name = "Dino";
        dog.feed();
        for (int i = 0; i < 20; i++) {
            dog.Walk();
        }
        Human Irek = new Human();
        Irek.firstName = "Ireneusz";
        Irek.lastName = "Nowak";
        Human Daniel = new Human();
        Daniel.firstName = "Daniel";
        Daniel.lastName = "Kowalski";
        Daniel.setSalary(1000.0);
        Car dreamcar = new Car("VW ", "Passat", 1998);
        Car dreamcar2 = new Car("VW ", "Passat", 1998);
        Phone iphone = new Phone("Iphone", "Xs", 2018);
        me.setSalary(2000.0);
        dreamcar.value = 2000.0;
        me.setCar(dreamcar);
        dreamcar.value = 20000.0;
        me.setCar(dreamcar);
        dreamcar.value = 100000.0;
        me.setCar(dreamcar);


        System.out.println(me);
        System.out.println(dog);
        System.out.println(iphone);
        System.out.println(dreamcar);
        System.out.println(dreamcar2);

        iphone.turnOn();
        dreamcar.turnOn();

        dog.sell(me, Irek, 200.0);

        System.out.println(me.cash);
        System.out.println(Irek.cash);

        me.setHuman(Daniel);
        iphone.sell(me, Daniel,100.0);
        dog.sell(me, Daniel, 100.0);
        Daniel.sell(me, Irek, 100.0);
    }
}