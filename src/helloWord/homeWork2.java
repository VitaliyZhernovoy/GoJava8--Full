package helloWord;


import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Как Вас зовут?");
        String name = sc.nextLine();


        System.out.println("В каком городе Вы живёте?");
        String city = sc.nextLine();


        int age = 0;
        while (true) try {
            System.out.println("Какой Ваш Возраст");
            age = sc.nextInt();
            sc.nextLine();
            break;
        } catch (Exception e) {
            System.out.println("Ошибка ввода!");
            sc.nextLine();
        }


            System.out.println("Какое Ваше Хобби");
            String hobby = sc.nextLine();
            System.out.println("");
            System.out.println("");

            


            System.out.println("Вариант 1: ");
            System.out.println("Имя:     " + name);
            System.out.println("Город:   " + city);
            System.out.println("Возраст: " + age);
            System.out.println("Хобби:   " + hobby);
            System.out.println("");
            System.out.println();

            System.out.println("Вариант 2");
            System.out.println("Человек по имени " + name + " живет в городе " + city);
            System.out.println("Этому человеку " + age + " лет и любит  " + hobby);
            System.out.println("");
            System.out.println();

            System.out.println("Вариант 3");
            System.out.println(name + " - Имя");
            System.out.println(city + " - Город проживания");
            System.out.println(age + " - Возраст");
            System.out.println(hobby + " - Хобби");
            System.out.println();
        }

}
