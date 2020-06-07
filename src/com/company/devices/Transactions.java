package com.company;

import com.company.creatures.Human;

import java.util.Date;

public class Transactions {
    public Human buyer;
    public Human seller;
    public Double cost;
    public Date date;

    public Transactions(Human seller, Human buyer, Double cost, Date date) {
        this.buyer = buyer;
        this.seller = seller;
        this.cost = cost;
        this.date = date;
        System.out.println("kupujący: " + buyer + " sprzedający: " + seller + " cena: " + cost+ " data: " + date);
    }
}