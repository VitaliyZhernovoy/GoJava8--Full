package vebinags.vebinar5_3extends_enimals;


public abstract class AnimalFourLegs  extends Animal{
    public AnimalFourLegs(String name, int age, int weight) {
        super(name, age, weight);
    }

    protected AnimalFourLegs() {
    }

    @Override
    public void run() {
        System.out.println("Бег на 4 лапах");

    }
}
