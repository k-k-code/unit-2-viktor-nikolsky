package ru.brunoyam.oop.models.transport;

import ru.brunoyam.oop.models.Passenger;

/**
 * Автобус прикрепленный к определенному маршруту.
 */
public class Bus extends Transport {
    /**
     * Наличие туалета в автобусе
     */
    private boolean hasToilet;
    /**
     * Количество остановок на маршруте
     */
    private int stopsNumber;

    private int currentPassengersNumber;

    private Passenger[] passengers = new Passenger[currentPassengersNumber];


    /**
     * Конструктор заполняющий все поля
     * @param hasToilet наличие туалет
     * @param stopsNumber количество остановок на маршруте
     * @param travelTime время в пути
     * @param seatsNumber количество мест
     * @param cost стоимость билета
     * @param currentPassengersNumber актуальное количество пассажиров
     */
    public Bus(boolean hasToilet, int stopsNumber,
               int travelTime, int seatsNumber, int cost, int currentPassengersNumber) {
        super(travelTime, seatsNumber, cost);
        this.hasToilet = hasToilet;
        this.stopsNumber = stopsNumber;
        this.currentPassengersNumber = currentPassengersNumber;
    }

    /**
     * Геттер для поля {@link #hasToilet hasToilet}
     * @return наличие туалета
     */
    public boolean isHasToilet() {
        return hasToilet;
    }

    /**
     * Геттер для поля {@link #stopsNumber stopsNumber}
     * @return количество остановок
     */
    public int getStopsNumber() {
        return stopsNumber;
    }

    /**
     * Сеттер для поля {@link @stopsNumber stopsNumber}
     * @param stopsNumber количество остановок
     */
    public void setStopsNumber(int stopsNumber) {
        this.stopsNumber = stopsNumber;
    }


    public int getCurrentPassengersNumber() {
        return currentPassengersNumber;
    }

    public void setCurrentPassengersNumber(int currentPassengersNumber) {
        this.currentPassengersNumber = currentPassengersNumber;
    }

    public String getType(){
        return "Bus";
    }


    /**
     * Возвращает текстовое представление объекта
     * @return текстовое представление объекта
     */
    @Override
    public String toString() {
        String transportDescription = super.toString() + " particular: ";
        return transportDescription + "Bus{" +
                "hasToilet=" + hasToilet +
                ", stopsNumber=" + stopsNumber +
                ", currentPassengersNumber=" + currentPassengersNumber +
                '}';
    }
}
