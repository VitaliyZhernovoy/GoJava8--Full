package vebinags.vebinar5_3extends_enimals;


public abstract class AnimalSnake extends  Animal {
    public AnimalSnake(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void run() {
        System.out.println("ползают по земле");
    }

}
