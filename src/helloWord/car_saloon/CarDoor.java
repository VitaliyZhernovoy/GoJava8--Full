package helloWord.car_saloon;


public class CarDoor {

    private int doors;
    private boolean doorsIsOpen = false;

    private int windows;
    private boolean windowsIsOpen = false;

   public CarDoor(){

   }

    public  boolean  toggleStateDor(){
        return doorsIsOpen = !doorsIsOpen;

    }
    public  boolean  toggleStateWindow(){
        return windowsIsOpen = !windowsIsOpen;

    }

    public boolean Doors() {
        if (doorsIsOpen = !doorsIsOpen)
            System.out.println("Дверь закрыли");
        else
            System.out.println("Дверь открыли");
        return Doors();
    }

    public boolean Windows(){
        if (windowsIsOpen = !windowsIsOpen)
            System.out.println("Окно закрыли");
        else
            System.out.println("Окно открыли");

        return Windows();
    }
}