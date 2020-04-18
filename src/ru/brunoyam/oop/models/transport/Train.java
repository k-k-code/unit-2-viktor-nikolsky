package ru.brunoyam.oop.models.transport;

public class Train extends Transport {

    private boolean hasToilet;

    private int stopsNumber;

    private int compartmentNumber;

    private String trainType;

    private boolean hasRestaurant;

    public Compartment[] compartments = new Compartment[compartmentNumber];



    public Train(boolean hasToilet, int stopsNumber, int compartmentNumber, String trainType, boolean hasRestaurant,
               int travelTime, int seatsNumber, int cost) {

        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
        this.compartmentNumber = compartmentNumber;
        this.trainType = trainType;
        this.hasRestaurant = hasRestaurant;
    }


    public boolean isHasToilet() {
        return hasToilet;
    }

    public int getStopsNumber() {
        return stopsNumber;
    }

    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }

    public int getCompartmentNumber() {
        return compartmentNumber;
    }

    public void setCompartmentNumber(int compartmentNumber) {
        this.compartmentNumber = compartmentNumber;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public boolean getHasRestaurant() {
        return hasRestaurant;
    }

    public Compartment[] getCompartments() {
        return compartments;
    }

    public void setCompartments(Compartment[] compartments) {
        this.compartments = compartments;
    }

    public String getType(){
        return "Train";
    }

    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Train{" +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber +
                ", compartmentNumber=" + compartmentNumber +
                ", trainType=" + trainType +
                ", hasRestaurant=" + hasRestaurant +
                '}';
    }
}
