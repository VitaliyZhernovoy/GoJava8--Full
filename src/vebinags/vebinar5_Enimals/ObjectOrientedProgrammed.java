package vebinags.vebinar5_Enimals;


import vebinags.vebinar5_Enimals.vegetables.Potato;

public class ObjectOrientedProgrammed {
    // ООП   ОБЪЕКТНО  ОРИЕНТИРОВАННОЕ   ПРОГРАММИРОВАНИЕ

    public static void main(String[] args) {
        // CОБАКИ
        Dog dogDefult = new Dog();
        dogDefult.setAge(10);
        dogDefult.showInfo();

        System.out.println();

        Dog dogSharik = new Dog("Шарик", 5);
        dogSharik.showInfo();// функцию которая будет выводить имя и возраст
        System.out.println();

        //КАРТОШКА
        Potato p = new Potato();
        p.releaseDate = 95;
        p.outDate = 10;
        p.refreshParams(100);
        System.out.println("Готова ли картошка к употриблению? " + p.getRedyToEat());




    }
}
