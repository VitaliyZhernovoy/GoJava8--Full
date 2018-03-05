package vebinags.vebinar5_3extends_enimals;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat(10,13);
        Cat cat2 = new Cat(5,7);
        Cat cat3 = new Cat(3,5);

        Dog dog1 = new Dog("Muhtar",5,20);
        Dog dog2  = new Dog("Lary",2,10);

        // cat1.age = 3; //так нельзя он private
        //cat1.mame = "Kitty";

        // dog1.age = 5; //так нельзя он private
        cat1.showWeight();
        dog1.showWeight();

        cat1.run();
        cat1.ws();

        //Animal animal = new Animal("SomeAnimal",10,10);

    }
}
