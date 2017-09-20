package helloWord.car_saloon;

        import java.util.ArrayList;
        import java.util.Date;

/*Класс Car.
    На прямую к переменным этого класса никто не может, только через методы
    --------------------
    Хранит:
    дата производства (не изменна после создания объекта)
    тип двигателя
    максимальная скорость машины (если она новая)
    время разгона до 100км/ч
            пассажировместимость
    кол-во пасажиров внутри в данный момент
    текущая скорость
    массив колес
    массив дверей
    Конструктор
    --------------------
    Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после
    создания объекта. Например дата производства.
    Конструктор с датой производства.
    Конструктор со всеми полями, кроме массива колес и массива дверей.
   */
public class Car {

    //Переменные
    private static Date dateOfManifacture;
    private String typeOfMotor;
    private Integer maxSpeedOfCar;
    private Integer TimeOfAcceleration;
    private Integer passengerCapacity;


    //Integer countPassenger;
    private Integer countOfPassenger;
    private Float currentSpeed;
    private ArrayList<CarDoor> arrayListOfDoors = new ArrayList<CarDoor>();
    private ArrayList<CarWheel> arrayListOfWheels = new ArrayList<CarWheel>();;


    //Конструктуры
    public Car(Date dateOfManifacture,
                   String typeOfMotor,
                   Integer maxSpeedOfCar,
                   Integer TimeOfAcceleration,
                   Integer passengerCapacity,
                   Integer countOfPassenger,
                   Float currentSpeed,
                   Integer countDoors,
                   Integer countWheels) {

        this.dateOfManifacture = dateOfManifacture;
        this.typeOfMotor = typeOfMotor;
        this.maxSpeedOfCar = maxSpeedOfCar;
        this.TimeOfAcceleration = TimeOfAcceleration;
        this.passengerCapacity = passengerCapacity;
        this.countOfPassenger = countOfPassenger;
        this.currentSpeed = currentSpeed;


        for (int i=0; i < countDoors; i++)
            this.arrayListOfDoors.add(new CarDoor());

        for (int i=0; i < countWheels; i++)
            this.arrayListOfWheels.add(new CarWheel());

    }

    public Car(Date dateOfManifacture,
                   String typeOfMotor,
                   Integer maxSpeedOfCar,
                   Integer TimeOfAcceleration,
                   Integer passengerCapacity,
                   Integer countOfPassenger,
                   Float currentSpeed) {

        this.dateOfManifacture = dateOfManifacture;
        this.typeOfMotor = typeOfMotor;
        this.maxSpeedOfCar = maxSpeedOfCar;
        this.TimeOfAcceleration = TimeOfAcceleration;
        this.passengerCapacity = passengerCapacity;
        this.countOfPassenger = countOfPassenger;
        this.currentSpeed = currentSpeed;

    }

    //Методы

    public CarDoor getDoor(Integer indexOfDoor) {

        return arrayListOfDoors.get(indexOfDoor);
    }

    public CarWheel getWheel(Integer indexOfWheel) {

        return arrayListOfWheels.get(indexOfWheel);
    }

    public Integer getCountWheels() {

        return arrayListOfWheels.size();
    }

    public Integer getCountDoors() {

        return arrayListOfDoors.size();
    }

    //Изменить текущую скорость
    public void changeCurrentSpeed(Float currentSpeed) {

        this.currentSpeed = currentSpeed;

    }

    //Посадить 1 пассажира в машину
    public void seatOnePassenger() {

        if (countOfPassenger < passengerCapacity){
            countOfPassenger++;
        } else {
            System.out.println("Извините. Все места заняты.");
        }

    }

    //Высадить 1 пассажира
    public void debarkOnePassenger() {

        if (countOfPassenger > 0){
            countOfPassenger--;
        }
        else System.out.println("В машине нет никого.");

    }

    //Высадить всех пассажиров
    public void debarkAllPassenger() {

        if (countOfPassenger > 0) {
            countOfPassenger = 0;
            System.out.println("Всех пассажиров вытрусили");
            currentSpeed = 0f;
        }
        else System.out.println("В машине нет никого.");
    }

    //Получить дверь по индексу
    public CarDoor getDoorByIndex(Integer indexOfDoor) {

        if (indexOfDoor > arrayListOfDoors.size())
            System.out.println("Количество дверей в машине " + arrayListOfDoors.size() + "! Введите другое число.");
        return arrayListOfDoors.get(indexOfDoor);

    }

    //Получить колесо по индексу
    public CarWheel getWheelByIndex(Integer indexOfWheel) {

        if (indexOfWheel > arrayListOfWheels.size())
            System.out.println("Количество дверей в машине " + arrayListOfWheels.size() + "! Введите другое число.");
        return arrayListOfWheels.get(indexOfWheel);

    }

    //Снять все колеса с машины
    public void pullOfAllWheelsFromCar() {

        for (int i = 0; i < arrayListOfWheels.size(); i++) {

        }
        arrayListOfWheels.clear();

    }

    //Установить на  машинуX новых колесу (в добаков к имеющимся, то есть если было 4 колеса, после вызова
    //метода с Х аргументом равным трем, колес будет 4+3=7)

    public void setNewWheel(Integer countNewWheels) {

        for (int i=0; i < countNewWheels; i++)
            arrayListOfWheels.add(new CarWheel());

    }

    //Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
    //Максимальная скорость новой машины множиться на самое стертое колесо в машине.
    //Максимальная скорость равна 0 если в машине нет ни одного пассажира.
    public void calculateCurrentMaxSpeed() {

        if (countOfPassenger == 0){
            maxSpeedOfCar = 0;
        }
        if (arrayListOfWheels.size() == 0) {
            maxSpeedOfCar = 0;
        }

        CarWheel wheel = arrayListOfWheels.get(0);
        Float currentBusIntegryty = wheel.getBusIntegrity();
        Float minBusIntegrity = wheel.getBusIntegrity();

        for (int i=0; i < arrayListOfWheels.size(); i++) {

            wheel = arrayListOfWheels.get(i);
            currentBusIntegryty = wheel.getBusIntegrity();
            if (currentBusIntegryty < minBusIntegrity) minBusIntegrity = currentBusIntegryty;

        }

        currentSpeed = maxSpeedOfCar * minBusIntegrity;

    }

    //Вывести в консоль данные о объекте (все поля и вычисленную максимальную скорость в
    //зависимости от целостности колес и наличия водителя)
    public void outputDataOfCar() {

        System.out.println("-------Данные о машине--------- ");
        System.out.println("Дата производства: " + dateOfManifacture);
        System.out.println("Тип двигателя: " + typeOfMotor);
        System.out.println("Максимальная скорость машины: " + maxSpeedOfCar);
        System.out.println("Пассажировместимость: " + passengerCapacity);
        System.out.println("Количество пассажиров внутpи на данный момент: " + countOfPassenger);
        System.out.println("Текущая скорость: " + currentSpeed);
        System.out.println("Количество колес: " + arrayListOfWheels.size());
        System.out.println("Количество дверей: " + arrayListOfDoors.size());

    }
}