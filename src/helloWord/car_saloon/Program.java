package helloWord.car_saloon;

import java.util.Date;
import java.util.Scanner;


public class Program {

    /*Создать консольный пользовательский интерфейс. В котором пользователя программа будет спрашивать
    какое действие выполнить и с какими параметрами.
    Кол-во различных действий = кол-ву функций в ДЗ.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Привет! Сейчас в твоем автосалоне нет машин.");

        //добавить машины в автосалон

        System.out.println("Сколько машин выставить на показ?");
        Integer countCars = Integer.parseInt(sc.nextLine());

        Car[] arrayCars = new Car[countCars];

        for (int i = 0; i < arrayCars.length; i++) {

            Date date = new Date();


            Car car1 = new Car(date,
                    "Дизель",
                    300,
                    10,
                    5,
                    1,
                    0.0f,
                    4,
                    4);

            arrayCars[i] = car1;
        }

        //ДЛЯ МАШИНЫ
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
        // вывести данные о состоянии второй шины
        //получить данные о машине


        System.out.println("В какой машине открыть дверь?");
        Integer numOfCar = Integer.parseInt(sc.nextLine());

        //Взяли машину
        Car car = arrayCars[numOfCar-1];

        System.out.println("Какую дверь отрыть?");
        Integer numOfDoor = Integer.parseInt(sc.nextLine());
         if (numOfDoor > car.getCountDoors()){
             System.out.println("error! в машине не может быть такое колличество дверей");
         }
         //получаем требуюмую дверь
        CarDoor carDoor = car.getDoor(numOfDoor-1);

         //открываем дверь
        carDoor.openDoor();

        //выводим состояние двери
        carDoor.outputCarDoor();

        //садим первого
        car.seatOnePassenger();
        //садим второго
        car.seatOnePassenger();

        //закрыть две дври
        car.getDoor(0).closeDoor();
        car.getDoor(1).closeDoor();

        //открыть 1 окно
        car.getDoor(1).openWindow();

        //изменяем скорость
        car.changeCurrentSpeed(60f);

        //стираем  4 шини
        car.getWheel(0).clearBusPartially(10);
        car.getWheel(1).clearBusPartially(10);
        car.getWheel(2).clearBusPartially(10);
        car.getWheel(3).clearBusPartially(10);

        //открыть по одной двери у разных машин

        arrayCars[2].getDoor(1).openDoor();
        if (arrayCars.length >= 5){
            arrayCars[4].getDoor(1).openDoor();
        } else {
            System.out.println("в салоне только" + arrayCars.length + " машины");
        }

        //высадить всех пассажиров
        car.debarkAllPassenger();



        //закрыть 2 двери
        car.getDoor(0).closeDoor();
        car.getDoor(1).closeDoor();

        // установить 1 новую шину
        car.getWheel(0).changeBusToNewOne();

        // вывести данные об состоянии второй шины
        car.getWheel(1).getBusIntegrity();

        //получить данные о машине
        car.outputDataOfCar();

    }
}