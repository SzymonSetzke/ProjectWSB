package com.company.devices;

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
}



