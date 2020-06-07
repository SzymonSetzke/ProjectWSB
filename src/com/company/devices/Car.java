package com.company.devices;

import com.company.Transactions;
import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.Date;


public class Car extends Device implements Refuel {

    public ArrayList<Transactions> transactions = new ArrayList<Transactions>();
    public ArrayList owners = new ArrayList();
    public Car(String producer, String model, int yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);

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
        if (!seller.hasCar(this)) {
            throw new Exception("nie masz tego auta!");
        }
        if (!buyer.hasFreeSpace()) {
            throw new Exception("za mały garaz!");
        }
        if (buyer.getCash() < price) {
            throw new Exception("za mało pieniedzy!");
        }

        this.transactions.add(new Transactions(seller, buyer, price, new Date()));
        seller.cash += price;
        seller.removeCar(this);
        buyer.cash -= price;
        buyer.addCar(this);
        owners.add(buyer);
        System.out.println("Sprzedane!");
    }

    @Override
    public int compareTo(Phone o) {
        return 0;
    }

    public void wasOwner(Human human) {
        if(transactions.stream().anyMatch(o -> o.buyer.equals(human))) {
            System.out.println("Był");
        } else {
            System.out.println("Nie był");
        }
    }
    public void numberOfTransactions() {
        int size = this.transactions.size();
        System.out.println("transakcje: " + size);
    }
    public boolean isThereWasTransaction( Human seller, Human buyer) {
        for (Transactions transactions : this.transactions) {
            if (seller == transactions.seller && buyer == transactions.buyer) {
                return true;
            }
        }
        return false;
    }
    public void ListOfTransactions() {
        System.out.println(owners);
    }
public void last (){
        if (owners != null && !owners.isEmpty()){
            System.out.println(owners.get(owners.size()-1));
        }
}

    @Override
    public void refuel() throws Exception {
        System.out.println("go to gas station");
    }


}