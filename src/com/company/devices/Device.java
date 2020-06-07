package com.company.devices;

import com.company.creatures.Human;

public abstract class Device implements Comparable<Device> {
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    public  Double value;


    public Device(String producer, String model, Integer yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;

    }

    public String toString() {
        return producer + " " + model;
    }

    public abstract void turnOn();

    @Override
    public int compareTo(Device o) {
        if (this == null) {
            return 1;
        } else if (o == null) {
            return -1;
        }
        return Integer.compare(this.yearOfProduction, o.yearOfProduction);
    }

    public abstract void sell(Human seller, Human buyer, Double price) throws Exception;

    public abstract int compareTo(Phone o);
}