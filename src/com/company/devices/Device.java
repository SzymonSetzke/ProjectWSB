package com.company.devices;

import com.company.creatures.Human;

public abstract class Device implements Comparable<Device> {
    public final String producer;
    public final String model;
    public final int yearOfProduction;
    public Double value = 1000.0;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
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
}