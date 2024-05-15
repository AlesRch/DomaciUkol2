package com.engeto.com.engeto;

public class Room {
    private int numberOfBeds;
    private boolean balcony;
    private boolean seaViews;
    private int pricepPerDay;

    public Room(int numberOfBeds, boolean balcony, boolean seaViews,
                int pricepPerDay) {
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaViews = seaViews;
        this.pricepPerDay = pricepPerDay;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public String getDescription() {
        return "Number of bed: " + numberOfBeds +(",") + " balcony: " + balcony +(",") + " sea views: " + seaViews +(",") +
                " price per day is: " + pricepPerDay + " Kč";
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaViews() {
        return seaViews;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaViews = seaViews;
    }

    public int getPricepPerDay() {
        return pricepPerDay;
    }

    public void setPricepPerDay(int pricepPerDay) {
        this.pricepPerDay = pricepPerDay;
    }
}
