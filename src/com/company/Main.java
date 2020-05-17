package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Szymon";
        me.lastName = "Setzke";
        Pet dog = new Pet ("dog");
        dog.name = "Dino";

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


        System.out.println(me.cash);
        System.out.println(Irek.cash);

        iphone.sell(me, Daniel,100.0);
        dog.sell(me, Daniel, 100.0);

        FarmAnimal cow = new FarmAnimal("cow");
       cow.beEaten();
        cow.feed(1.0);
        me.feed(1.0);
        dreamcar.refuel();

        String[] apps = {"facebook", "messenger"};

        me.phone.installAnApp("facebook");
        me.phone.installAnApp("facebook", "2.4.21");
        me.phone.installAnApp(apps);
        me.phone.installAnApp(new URL("https", "https://play.google.com/facebook", 443, "facebook"));

        Daniel.sell(me, Irek, 100.0);
    }
}