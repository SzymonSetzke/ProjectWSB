package com.company.devices;

import com.company.Human;

public class Car extends Device {
    public Double value;
    public Car(String producer, String model, int yearofproduction) {
        super(producer, model, yearofproduction);
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
        if (buyer.cash >= price) {
            seller.cash += price;
            buyer.cash -= price;
            buyer.car = this;
            if (seller.car == this) {
                seller.car = null;
            }
            System.out.println(buyer.firstName + " bought " + this.toString() + " from " + seller.firstName + " for " + price);
        } else {
            throw new Exception("you don't have enough money");
        }
    }
    }