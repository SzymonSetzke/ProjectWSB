package com.company.devices;

public class Application implements Comparable<Application> {
    private final String appName;
    public Double price = 0.0;
    private String version;


    public Application(String appName, String version, Double price) {
        this.appName = appName;
        this.version = version;
        this.price = price;
    }

    public String getVersion() {
        return version;
    }

    public String getAppName() {
        return appName;
    }

    public Double getPrice() {
        return price;
    }

    public String toString() {
        return this.appName + " " + this.version;
    }


    @Override
    public int compareTo(Application o) {
        return this.appName.compareTo(o.appName);

    }

}