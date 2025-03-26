package com.eaaslan.realestate.model;

import java.util.UUID;

public class Residence {
    private UUID id;
    private double price;
    private double squareMeter;
    private int roomCount;
    private int salonCount;

    public Residence(double price, double squareMeter, int roomCount, int salonCount) {
        this.id = UUID.randomUUID();
        this.price = price;
        this.squareMeter = squareMeter;
        this.roomCount = roomCount;
        this.salonCount = salonCount;
    }

    @Override
    public String toString() {
        return "Residence{" +
                "id=" + id +
                ", price=" + price +
                ", squareMeter=" + squareMeter +
                ", roomCount=" + roomCount +
                ", salonCount=" + salonCount +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getSalonCount() {
        return salonCount;
    }

    public void setSalonCount(int salonCount) {
        this.salonCount = salonCount;
    }
}