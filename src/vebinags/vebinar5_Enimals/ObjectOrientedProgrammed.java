package vebinags.vebinar5_Enimals;

// ООП   ОБЪЕКТНО  ОРИЕНТИРОВАННОЕ   ПРОГРАММИРОВАНИЕ


public class ObjectOrientedProgrammed {
    public static void main(String[] args) {
        Dog dogDefult = new Dog();
        dogDefult.showInfo();

        System.out.println();

        Dog dogSharik = new Dog("Шарик", 5);
        dogSharik.showInfo();// функцию которая будет выводить имя и возраст



    }
}
