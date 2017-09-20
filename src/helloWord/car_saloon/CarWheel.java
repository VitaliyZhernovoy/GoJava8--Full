package helloWord.car_saloon;


/*Класс CarWheel
    На прямую к переменным этого класса никто не может, только через методы
    --------------------
    Хранит:
    Состояние целостности шины (дробное число от 0-стерта до 1-новая)
    Конструктор
    --------------------
    Аналогичный принцип как в классе CarDoor
    Методы
    --------------------
    */

public class CarWheel {

    private Float busIntegrity;

    public CarWheel() {

        busIntegrity = 1f;

    }

    public CarWheel(float busIntegrity) {

        this.busIntegrity = busIntegrity;
    }


    //Сменить шину на новую
    public void changeBusToNewOne() {

        busIntegrity = 1f;
    }

    //Стереть шину на X%
    public void clearBusPartially(float percentageOfWear) {

        busIntegrity = busIntegrity - (busIntegrity * percentageOfWear / 100);
        if (busIntegrity < 0f) {
            busIntegrity = 0f;
        }

    }

    //Получить состояние шины в процентах
    public float getStateOfBus() {

        Float percentageOfWear = (1 - busIntegrity) * 100;

        return percentageOfWear;

    }

    //Получить состояние шины
    public float getBusIntegrity() {

        return busIntegrity;

    }

    //Вывести в консоль данные об объекте
    public void GetOutputDataofWheel() {

        System.out.println("Процент износа шины составляет: " + getStateOfBus() + "%.");

    }
}