package com.niranjan.assignment_calculator_ultimate;

public class Car {

    private String make, year, color, purchase, engine;

    public Car() {
    }

    public Car(String make, String year, String color, String purchase, String engine) {
        this.make = make;
        this.year = year;
        this.color = color;
        this.purchase = purchase;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPurchase() {
        return purchase;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
