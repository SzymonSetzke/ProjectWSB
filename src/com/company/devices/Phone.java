package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device {

    private static final String DEFAULT_APP_SERVER = "myapps.com";
    private static final String DEFAULT_PROTOCOL = "https";
    private static final Integer DEFAULT_PORT = 443;
    public Set<Application> myApps;
    private final Human owner;

    public Phone(String producer, String model, Integer yearOfProduction, Double value, Human owner) {
        super(producer, model, yearOfProduction, value);
        this.myApps = new HashSet<Application>();
        this.owner = owner;
    }

    @Override
    public void turnOn() {
        System.out.println("turn on");
    }


    public String toString() {
        return producer + " " + model;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
            System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("you don't have enough money");
        }
    }

    @Override
    public int compareTo(Phone o) {
        return 0;
    }

    public Application getApp(String name) {
        for (Application app : myApps) {
            if (app.getAppName().equals(name)) {
                return app;
            }
        }
        return null;
    }


    public void installAnApp(Application appName) throws Exception {
        if (owner.getCash() < appName.getPrice()) {
            throw new Exception("Masz za mało gotówki!");
        }


        owner.setCash(owner.getCash() - appName.getPrice());
        this.myApps.add(appName);
        System.out.println(owner + " kupił " + appName + " za " + appName.getPrice()+ " zł");
        System.out.println(owner + " ma teraz " + owner.getCash() + " zł");
        System.out.println("Zainstalowano!");

    }
    public void installAnApp(Application appName, Application version) throws MalformedURLException {
        URL url = new URL(DEFAULT_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT, appName + "=" + version);
        installAnApp(url);
    }

    public void installAnApp(URL url) throws MalformedURLException {

        System.out.println("Aplikacja " + url.getFile() + " została zainstalowana");
    }

    public void checkIfAppIsInstalled(Application app) {
        if (this.myApps.contains(app)) {
            System.out.println(app + " jest zainstalowana");
        } else {
            System.out.println("nie jest zainstalowana");
        }
    }

    public void allFreeApps() {
        System.out.print("Darmowe aplikacje: ");
        for (Application app : this.myApps) {
            if (app.getPrice().equals(0.0)) {
                System.out.print(app.getAppName() + ", ");

            }
        }
        System.out.println();
    }

    public Double sumValueOfApps() {
        double value = 0.0;
        Iterator<Application> i = this.myApps.iterator();
        while (i.hasNext()) {

            value += i.next().price;
        }
        System.out.print("Wartość aplikacji: ");
        return value;
    }

    public void sortAlphabeticalApps() {
        List<Application> list = new ArrayList<>(myApps);
        Collections.sort(list);
        System.out.println("Sortowanie alfabetyczne: " + list);
    }

    public void sortValuesOfApps() {
        List<Application> list = new ArrayList<>(myApps);
        list.sort(new ValueComparator());
        System.out.println("Sortowanie od najtańszych: " + list);
    }

}