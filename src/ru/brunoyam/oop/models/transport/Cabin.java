package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

public class Cabin {
    private int seatNumber;

    private String comfortLevel;

    private int currentPassengersNumber;

    private Passenger[] passengers = new Passenger[currentPassengersNumber];

    public Cabin(int seatNumber, String comfortLevel, int currentPassengerNumber) {

        this.seatNumber = seatNumber;
        this.comfortLevel = comfortLevel;
        this.currentPassengersNumber = currentPassengersNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(String comfortLevel) {
        this.comfortLevel = comfortLevel;
    }


    public int getCurrentPassengersNumber() {
        return currentPassengersNumber;
    }

    public void setCurrentPassengersNumber(int currentPassengersNumber) {
        this.currentPassengersNumber = currentPassengersNumber;
    }


    public String info() {
        return "current cabin info: seatNumber=" + seatNumber +
                ", comfortLevel=" + comfortLevel +
                ", currentPassengersNumber=" + currentPassengersNumber +
                ".";
    }



}
