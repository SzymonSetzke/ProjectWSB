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
        Animal pet;
        private Car car;
    }