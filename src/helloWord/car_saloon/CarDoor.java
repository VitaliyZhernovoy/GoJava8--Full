package helloWord.car_saloon;

/*Класс CarDoor
   На прямую к переменным этого класса никто не может, только через методы
   --------------------
   Хранит:
   состояние двери(открыта/закрыта)
   состояние окна (открыто/закрыто)
   Конструктор
   --------------------
   Требуется насколько конструкторов на различные случаи
   Один без аргументов. Он должен присвоить переменым значения на случай если данных нет.
   Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.
   Методы
   --------------------
   открыть дверь
   закрыть дверь
   открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
   открыть окно
   закрыть окно
   открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
   Вывести в консоль данные об объекте*/


public class CarDoor {

    //Переменные

    private Boolean stateOfDoor;
    private Boolean stateOfWindow;

    //Конструкторы

    public CarDoor() {

        stateOfDoor = true;
        stateOfWindow = false;

    }

    public CarDoor(Boolean StateOfDoor, Boolean StateOfWindow) {

        this.stateOfDoor = StateOfDoor;
        this.stateOfWindow = StateOfWindow;
    }

    //Методы работы с дверью

    public void openDoor() {

        stateOfDoor = true;

    }

    public void closeDoor() {

        stateOfDoor = false;
    }

    public void openCloseDoor() {

        stateOfDoor = !stateOfDoor;
    }

    //Методы работы с окном

    public void openWindow() {

        stateOfWindow = true;

    }

    public void closeWindow() {

        stateOfWindow = false;
    }

    public void openCloseWindow() {

        stateOfWindow = !stateOfWindow;

    }

    public void outputCarDoor() {

        System.out.println("Дверь открыта? " + stateOfDoor);
        System.out.println("Окно открыто? " + stateOfWindow);


    }

}
