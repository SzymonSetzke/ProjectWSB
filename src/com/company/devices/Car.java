package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device implements Refuel {
    public Double value;
    public Car(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("turn on");
    }


    public String toString() {

        return producer +" " +model;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("nie masz tego auta!");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("za mały garaz!");
        }
        if (buyer.getCash() < price) {
            throw new Exception("za mało pieniedzy!");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("sprzedane!");
    }
    

    @Override
    public void refuel() throws Exception {
        System.out.println("go to gas station");
    }
}