package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    private Double salary;
    public Double cash = 20000.0;

    public Human(String species) {
        super(species);
    }

    public Human() {
        super("czlowiek", 80.0);
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
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        if (car.value <= salary) {
            System.out.println(this.firstName + " " + this.lastName + " bought " + car.model + " for cash.");
            this.car = car;
        } else if (car.value <= salary * 12) {
            System.out.println(this.firstName + " " + this.lastName + " bought " + car.model + " on credit.");
            this.car = car;
        } else {
            System.out.println(this.firstName + " " + this.lastName + " doesn't have enough money. Go study or find better job.");
        }
    }

    public void feed() {
        System.out.println("thanks");
    }
    public void feed(Double foodWeight) {
        this.weight += foodWeight;
        if (foodWeight > 1.0) {
            System.out.println("too much food");
        } else {
            System.out.println("need more food");
        }
    }

    public Animal pet;
    public Car car;
    public Phone phone;
    public String toString() {
        return firstName + " " + lastName;
    }
}