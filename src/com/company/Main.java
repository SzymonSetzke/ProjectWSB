package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Application;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.YearComparator;

import java.net.MalformedURLException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Szymon";
        me.lastName = "Setzke";
        Pet dog = new Pet ("dog");
        dog.name = "Dino";

        Human Irek = new Human(1);
        Irek.firstName = "Ireneusz";
        Irek.lastName = "Nowak";
        Human Daniel = new Human(1);
        Daniel.firstName = "Daniel";
        Daniel.lastName = "Kowalski";
        Daniel.setSalary(1000.0);
        Car dreamcar = new Car("VW ", "Passat", 1998, 5000.0);
        dreamcar.value = 10000.0;
        Car dreamcar2 = new Car("VW ", "Passat", 1998, 4500.0);
        dreamcar.value = 11500.0;
        Phone iphone = new Phone("Iphone", "Xs", 2018, 1000.0, me);
        me.phone = iphone;
        me.setSalary(2000.0);
        me.setCar(new Car("BMW","M3", 2010, 25000.0),0);
        Daniel.setCar(new Car("AUDI","A4",2000, 5000.0),0);
        me.setCar(dreamcar, 1);
       // dreamcar.value = 2000.0;
       // me.setCar(dreamcar);
       // dreamcar.value = 20000.0;
        //me.setCar(dreamcar);
       // dreamcar.value = 100000.0;
        //me.setCar(dreamcar);


        System.out.println(me);
        System.out.println(dog);
        System.out.println(iphone);
        System.out.println(dreamcar);
        System.out.println(dreamcar2);

        iphone.turnOn();
        dreamcar.turnOn();


        System.out.println(me.cash);
        System.out.println(Irek.cash);

        //iphone.sell(me, Daniel,100.0);
        dog.sell(me, Daniel, 100.0);

        FarmAnimal cow = new FarmAnimal("cow");
        cow.beEaten();
        cow.feed(1.0);
        me.feed(1.0);
        dreamcar.refuel();

      //  String[] apps = {"Facebook", "Skype", "Instagram"};
       // try {
       //     me.phone.installAnApp(apps);
       //     me.phone.installAnApp("Spotify", "latest");

      //  } catch (MalformedURLException e) {
      //     e.printStackTrace();
      //  }
        //Daniel.sell(me, Irek, 100.0);

        System.out.println(Arrays.toString(me.getGarage()));
        YearComparator yop = new YearComparator();
        Arrays.sort(me.getGarage(), yop);
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(Irek.getGarage()));
        System.out.println(Arrays.toString(Daniel.getGarage()));
        System.out.println(Irek.cash);
        System.out.println(me.cash);
        System.out.println(me.valueOfCars());

        try {
            dreamcar.sell(me, Irek, 2000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(me.getGarage()));
        System.out.println(Arrays.toString(Irek.getGarage()));
        System.out.println(Arrays.toString(Daniel.getGarage()));
        System.out.println(Irek.cash);
        System.out.println(me.cash);
        System.out.println(me.valueOfCars());
        dreamcar.ListOfTransactions();
        boolean check1 = dreamcar.isThereWasTransaction(Irek, me);
        com.company.Transactions transaction1 = new com.company.Transactions (Irek, Daniel, 5600.0,  new Date());
        dreamcar.transactions.add(transaction1);
        com.company.Transactions transaction2 = new com.company.Transactions (me, Irek, 4500.0,  new Date());
        dreamcar2.transactions.add(transaction2);
        boolean check2 = dreamcar.isThereWasTransaction(Irek, Daniel);
        boolean check3 = dreamcar2.isThereWasTransaction(me, Irek);
        System.out.println("check: "+check1+" "+check2+" "+check3);
        dreamcar.numberOfTransactions();
        dreamcar2.numberOfTransactions();
        dreamcar.wasOwner(me);
        dreamcar.wasOwner(Daniel);
        dreamcar.ListOfTransactions();
        try {
            dreamcar.sell(Irek, me, 2000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        dreamcar.ListOfTransactions();
        dreamcar.last();

        Application app1 = new Application("Skype", "10", 10.0);
        Application app2 = new Application("Spotify", "2.1", 0.0);
        me.phone.installAnApp(new Application("Facebook", "latest", 5.0));
        me.phone.installAnApp(new Application("Allegro", "latest", 0.0));
        me.phone.installAnApp(new Application("MojeWSB", "5", 100.0));
        me.phone.installAnApp(app1);
        me.phone.installAnApp(app2);
        me.phone.checkIfAppIsInstalled(app1);
        me.phone.checkIfAppIsInstalled(me.phone.getApp("Facebook"));
        System.out.println(me.phone.myApps);
        me.phone.allFreeApps();
        System.out.println(me.phone.sumValueOfApps());

        me.phone.sortValuesOfApps();
        me.phone.sortAlphabeticalApps();

    }
}