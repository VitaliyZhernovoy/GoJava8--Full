package helloWord.car_saloon;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import helloWord.car_saloon.Common;


public class Program {

    /*Создать консольный пользовательский интерфейс. В котором пользователя программа будет спрашивать
    какое действие выполнить и с какими параметрами.
    Кол-во различных действий = кол-ву функций в ДЗ.*/

    public static void main(String[] args) {

        ArrayList<Car> arrayListCars = new ArrayList<Car>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Привет! Сейчас в твоем автосалоне нет машин.");

        //добавить машины в автосалон

        Integer countCars = Common.getNumericData(sc, "Сколько машин выставить на показ?");

        for (int i = 0; i < countCars; i++) {

            Date date = new Date(20151107);
            Car car = new Car(date,
                    "Гибридный",
                    180,
                    7,
                    5,
                    0,
                    (float) 0,
                    4,
                    4);
            car.getDoor(i).closeDoor();
            arrayListCars.add(car);

        }

        //ДЛЯ ПЕРВОЙ МАШИНЫ
        //открыть 2 двери
        //посадить 2 пассажира в первую машину
        //закрыть 2 двери
        //открыть 1 окно
        //изменить текущую скорость
        //стереть 4 шины на 10%
        //открыть 2 двери
        //высадить всех пассажиров
        //закрыть 2 двери
        // установить 1 новую шину
        // вывести данные об состояниb второй шины
        //получить данные об машине

        Car car1 = arrayListCars.get(0);
        CarDoor door1 = car1.getDoor(0);
        door1.openCloseDoor();
        CarDoor door2 = car1.getDoor(1);
        door2.openCloseDoor();
        car1.seatOnePassenger();
        car1.seatOnePassenger();
        door1.openCloseDoor();
        door2.openCloseDoor();
        car1.changeCurrentSpeed(0f);
        for (int i = 0; i < car1.getCountWheels(); i++) {

            CarWheel wheel = car1.getWheel(i);
            wheel.clearBusPartially(10f);

        }

        door1.openCloseDoor();
        door2.openCloseDoor();

        car1.debarkAllPassenger();

        door1.openCloseDoor();
        door2.openCloseDoor();

        CarWheel wheel1 = car1.getWheel(0);
        wheel1.changeBusToNewOne();

        CarWheel wheel2 = car1.getWheel(1);
        wheel2.changeBusToNewOne();

        car1.outputDataOfCar();
        Integer countDoors = car1.getCountDoors();
        for (int i=0; i < countDoors; i++) car1.getDoor(i).outputCarDoor();



    }


}