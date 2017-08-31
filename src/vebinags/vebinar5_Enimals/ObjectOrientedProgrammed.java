package vebinags.vebinar5_Enimals;

// ООП   ОБЪЕКТНО  ОРИЕНТИРОВАННОЕ   ПРОГРАММИРОВАНИЕ


public class ObjectOrientedProgrammed {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        System.out.println(dogBobik.name);

        Dog dogSharik = new Dog("Шарик");
        dogSharik.setAge(-5);
        dogSharik.showInfo();// или так вот создать отдельнуюфункцию которая будет выводить имя и возраст


    }
}
