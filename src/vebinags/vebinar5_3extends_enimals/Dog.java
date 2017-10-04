package vebinags.vebinar5_3extends_enimals;


import vebinags.vebinar5_3extends_enimals.interf.IDrink;

public class Dog extends AnimalFourLegs {

    public Dog(String name, int age, int weight) {
        super(name, age, weight);
        System.out.println("Объект собаки |" + name + "| создан");
    }

    //переопределение метода,тоесть изменяем фуекционал метода
@Override
    public  void showWeight(){
        //ничего не делает так как мы ее переопределили
        //удалив вывод в консоль sout
    System.out.print("Точный вес собаки = ");
    super.showWeight();

    }


    @Override
    public void drink() {
        System.out.println("песик пьёт");

    }

    @Override
    public void ws() {
        System.out.println("песик ходит в туалет");

    }
}
