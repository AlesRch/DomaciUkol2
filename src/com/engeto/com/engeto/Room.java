package com.engeto.com.engeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private boolean balcony;
    private boolean seaView;
    private int pricepPerDay;

    public Room(int roomNumber, int numberOfBeds, boolean balcony, boolean seaViews, int pricepPerDay) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaView = seaViews;
        this.pricepPerDay = pricepPerDay;
    }

    public int getiD() {
        return roomNumber;
    }

    public String getDescription() {
        return "Room number: " +roomNumber + " Beds: " + numberOfBeds + " Balcony: " + balcony
                + " Seaview: " + seaView + " Price per day: " +pricepPerDay + (" Kč");
    }

    public void setiD(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
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
        return seaView;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaView = seaViews;
    }

    public int getPricepPerDay() {
        return pricepPerDay;
    }

    public void setPricepPerDay(int pricepPerDay) {
        this.pricepPerDay = pricepPerDay;
    }
}