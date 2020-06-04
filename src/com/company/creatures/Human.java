package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;


import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Double salary = 1000.0;
    public Double cash = 20000.0;
    private static final Integer DEFAULT_GARAGE_SIZE = 2;
    private final Car[] garage;
    public Animal pet;
    public Phone phone;
    public String toString() {
        return firstName + " " + lastName;
    }

    public Human() {

        super("homo sapiens");
        this.weight = 75.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(Integer garageSize) {
        super("czlowiek");
        this.weight = 75.0;
        this.garage = new Car[garageSize];
    }
    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) throws Exception {
        if (cash >= 0) {
            this.cash = cash;
        } else {
            throw new Exception("heheszke");
        }
    }
    public Car[] getGarage() {
        return this.garage;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        if(salary >= 0) {
            System.out.println("Your salary is now: " + salary);
            System.out.println("New value of salary has been added to salary history.");
            System.out.println("Please pick up the annex to the contract form Mrs Hania.");
            System.out.println("ZUS and US has been informed.");
            this.salary = salary;
        }
    }
    public Car getCar(Integer id) {
        return garage[id];
    }

    public void setCar(Car car, Integer id) {
        this.garage[id] = car;
    }

    //public void feed() {
       // System.out.println("thanks");
    //}
    //public void feed(Double foodWeight) {
    //    this.weight += foodWeight;
    //    if (foodWeight > 1.0) {
    //        System.out.println("too much food");
    //    } else {
   //         System.out.println("need more food");
    //    }
   // }
    public double valueOfCars() {
        Double sum = 0.0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;
            }
        }
        return sum;
    }

    public void sortGarage(Comparator comparator) {
        Arrays.sort(this.garage, comparator);
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) throws Exception {
        if (this.hasFreeSpace()) {
            for (int i = 0; i < this.garage.length; i++) {
                if (this.garage[i] == null) {
                    this.garage[i] = newCar;
                    break;
                }
            }
        } else {
            throw new Exception("nie ma miejsca!");
        }
    }
}
