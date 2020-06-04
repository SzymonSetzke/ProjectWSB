package com.company.creatures;

public interface Feedable {
    void feed();

    void feed(Double foodWeight);

    void sell(Human seller, Human buyer, Double price) throws Exception;
}