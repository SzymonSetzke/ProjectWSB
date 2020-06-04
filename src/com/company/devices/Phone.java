package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {


    public Phone(String producer, String model, int yearofproduction) {
        super(producer, model, yearofproduction);
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

    public void installAnApp(String[] apps) {
        for (String app : apps) {
            installAnApp(app);
        }
    }

    public void installAnApp(String app) {
        installAnApp(app, "latest");
    }

    public void installAnApp(String app, String version) {
        try {
            URL url = new URL("https", "https://play.google.com/", 443, app + "_" + version);
            installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL url) {
        System.out.println("app installed " + url.getFile());
    }

}
