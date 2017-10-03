package vebinags.vebinar5_3extends_enimals;

/**
 * Created by Оля on 03.10.2017.
 */
public class AnimalSnake extends  Animal {
    public AnimalSnake(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("ползают по земле");
    }
}
