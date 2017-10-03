package vebinags.vebinar5_3extends_enimals;


public class Cat extends AnimalFourLegs {

    public Cat(int age, int weight) {       //тут можно удалить име и прописать его ниже, и всех
        super("Kittiy", age, weight); //котов будут звать Китти
        System.out.println("Объект кота создан");
    }
    
}
