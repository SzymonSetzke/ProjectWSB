package com.company.devices;

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
}