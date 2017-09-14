package helloWord.car_saloon;


public class Program {
    public static void main(String[] args) {

        CarDoor door = new CarDoor();

        System.out.println("Дверь открыта? "+ door.toggleStateDor());
        System.out.println("Дверь открыта? "+ door.toggleStateDor());

        System.out.println("Окно открыто?  "+ door.toggleStateWindow());
        System.out.println("Окно открыто?  "+ door.toggleStateWindow());

        CarDoor doors = new CarDoor();

        System.out.println("Состояние двери " + doors.Doors() );
        System.out.println("Состояние окна " + doors.Windows());


    }
}
