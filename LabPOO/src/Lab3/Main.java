package Lab3;

public class Main {

    public static void main(String[] args) {

        Vehicle boat = new Boat();
        Vehicle car = new Car();

        String nameBoat1 = Boat.name("Quintessence Yachts", " AM37");
        String nameBoat2 = Boat.name("Quintessence Yachts", " AM37", " First");

        System.out.println(nameBoat1);

        boat.start();

        String nameCar1 = Boat.name("Mazda", " RX-7");
        String nameCar2 = Boat.name("Mazda", " RX-7", " FD");

        System.out.println(nameCar2);

        car.start();
    }
}
