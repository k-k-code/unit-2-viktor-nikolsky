package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

/**
 * Авиатранспорт (самолет) прикрепленный к определенному авиамаршруту
 */
public class Plane extends Transport {

    private boolean luggage;

    private int exitsNumber;

    private int rowNumber;

    private int currentPassengersNumber;

    private Passenger[] passengers = new Passenger[currentPassengersNumber];


    public Plane(int travelTime, int seatsNumber,
                 int cost, int currentPassengerNumber, int exitsNumber, int rowNumber, boolean luggage) {

        super(travelTime, seatsNumber, cost);
        this.luggage = luggage;
        this.exitsNumber = exitsNumber;
        this.rowNumber = rowNumber;
    }


    public boolean hasLuggage() {
        return luggage;
    }


    public int getExitsNumber() {
        return exitsNumber;
    }


    public void setExitsNumber(int exitsNumber) {
        this.exitsNumber = exitsNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getCurrentPassengersNumber() {
        return currentPassengersNumber;
    }

    public void setCurrentPassengersNumber(int currentPassengersNumber) {
        this.currentPassengersNumber = currentPassengersNumber;
    }

    public String getType(){
        return "Plane";
    }


    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Plane{" +
                "luggage=" + luggage +
                ", exitsNumber=" + exitsNumber +
                ", rowNumber=" + rowNumber +
                ", currentPassengersNumber=" + currentPassengersNumber +
                '}';
    }

}
