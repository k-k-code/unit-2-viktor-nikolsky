package ru.brunoyam.oop;

import ru.brunoyam.oop.models.Passenger;
import ru.brunoyam.oop.models.transport.*;

/**
 * Главный класс нашего приложения.
 */
public class Appilcation {


    /**
     * Главный класс приложения
     * @param args - набор аргументов запуска приложения.
     */
    public static void main(String[] args) {

        int passengersNumber = 1000;
        int transportsNumber = 4;

        Transport[] transports = new Transport[transportsNumber];
        Passenger[] passengers = new Passenger[passengersNumber];

        Bus yellowBus = new Bus(false, 5, 60, 25, 20, 0);
        Plane greenPlane = new Plane(90, 160, 1000, 0, 8, 36, true);
        Ship whiteShip = new Ship(true, 2, 60, 3, "Liner", "Admiral", 780, 360, 600);
        Train blackTrain = new Train(true, 10, 40, "Locomotive", true, 640, 160, 300);

        transports[1] = yellowBus;
        transports[2] = greenPlane;
        transports[3] = whiteShip;
        transports[4] = blackTrain;

        String[] names = new String[]{"Kolya", "Vitya", "Slava", "Dima", "Petya", "Vasya", "Pumba", "Timon", "Fortis", "Anatolik"};
        String[] surnames = new String[]{"Zanuda", "Nikolsky", "Efimov", "Fat", "Phonin", "Matushenko", "Pesik", "Cranberry", "Hot"};
        String[] secondNames = new String[]{"Vasiliev", "Aleksandrov", "Pesikov", "Kotikov", "Nikolaevich", "Sergeevich"};


        for (Passenger passenger: passengers) {
            passenger.name = names[(int)(10.0 * Math.random())];
            passenger.surname = surnames[(int)(9.0 * Math.random())];
            passenger.secondName = secondNames[(int)(6.0 * Math.random())];
            passenger.docNumber = String.valueOf((100000000.0 * Math.random()));
        }

        int count = 0;

        for (Transport transport: transports) {
            if(count < passengersNumber){
            if (transport.getType()=="Bus"){
                for (int i = 0; i < transport.getSeatsNumber(); i++) {
                    System.out.println(passengers[count].getInfo());
                }

            }
            else if (transport.getType()=="Train"){}
            else if (transport.getType()=="Ship"){}
            else if (transport.getType()=="Plane"){}
            count++;}
            else {
                System.out.println("Boarding is completed");
            }
            }
        }
    }

}
