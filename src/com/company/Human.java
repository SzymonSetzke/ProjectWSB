package com.company;
public class Human {
    String firstName;
    String lastName;
    private Double salary;
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
    Animal pet;
    Car car;
}