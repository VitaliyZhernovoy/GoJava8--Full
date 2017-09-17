package vebinags.vebinar5_enimals;


import vebinags.vebinar5_enimals.strucure.Farm;
import vebinags.vebinar5_enimals.strucure.furniture.Table;
import vebinags.vebinar5_enimals.vegetables.Potato;

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
        System.out.println();

        System.out.println("Ферма");
        Farm farm = new Farm();
        farm.dog[9].showInfo();








    }
}
