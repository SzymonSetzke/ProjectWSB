package com.company.devices;

import java.util.Comparator;

public class ValueComparator implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return (int) (o1.price - o2.price);
    }
}