package lessons.generic;

import helloWord.car_saloon.Car;
import vebinags.vebinar5_3extends_enimals.Cat;

public class GenericExample {
    public static void main(String[] args) {
        Dog<Cat> dog1 = new Dog<>("dog3", 4);
        dog1.obj = new Cat(1,3);

        Dog<Car> dog2 = new Dog<>("dog3", 4);
        dog2.obj = new Car();


        dog2.getObj();
        dog1.getObj();

    }
}

