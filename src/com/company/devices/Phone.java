package com.company.devices;

import com.company.Human;

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
    }




