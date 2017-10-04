package vebinags.vebinar5_3extends_enimals;


import vebinags.vebinar5_3extends_enimals.interf.IDrink;

public class Cat extends AnimalFourLegs implements IDrink {

    public Cat(int age, int weight) {       //тут можно удалить име и прописать его ниже, и всех
        super("Kittiy", age, weight); //котов будут звать Китти
        System.out.println("Объект кота создан");
    }

    @Override
    public void drink() {
        System.out.println("котит пьёт");

    }

    @Override
    public void ws() {
        System.out.println("котит ходит в туалет");

    }

}
