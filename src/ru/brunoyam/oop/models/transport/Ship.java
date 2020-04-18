package ru.brunoyam.oop.models.transport;

public class Ship extends Transport {

    private boolean hasFood;

    private int stopsNumber;

    private int cabinNumber;

    private int deckNumber;

    private String shipType;

    private String shipName;

    private Cabin[] cabins = new Cabin[cabinNumber];



    public Ship(boolean hasFood, int stopsNumber, int cabinNumber, int deckNumber, String shipType, String shipName,
               int travelTime, int seatsNumber, int cost) {

        super(travelTime, seatsNumber, cost);
        this.hasFood = hasFood;
        this.stopsNumber = stopsNumber;
        this.cabinNumber = cabinNumber;
        this.deckNumber = deckNumber;
        this.shipType = shipType;
        this.shipName = shipName;
    }


    public boolean isHasFood() {
        return hasFood;
    }

    public int getStopsNumber() {
        return stopsNumber;
    }

    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    public int getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(int cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public int getDeckNumber() {
        return deckNumber;
    }

    public void setDeckNumber(int deckNumber) {
        this.deckNumber = deckNumber;
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public Cabin[] getCabins() {
        return cabins;
    }

    public void setCabins(Cabin[] cabins) {
        this.cabins = cabins;
    }

    public String getType(){
        return "Ship";
    }


    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Bus{" +
                "hasToilet=" + hasFood +
                ", stopsNumber=" + stopsNumber +
                ", cabinNumber=" + cabinNumber +
                ", deckNumber=" + deckNumber +
                ", shipType=" + shipType +
                ", shipName=" + shipName +
                '}';
    }
}
