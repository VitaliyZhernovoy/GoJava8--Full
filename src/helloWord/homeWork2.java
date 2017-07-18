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

        output(name,city,age,hobby);
    }

    static void output(String name, String city, int age, String hobby) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Выбери выриант вывода информации:\n1: табличный\n" +
                           "2: текстовый\n3: иной\n4:все варианты одновременно");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Имя: " + name + "\nГород: " + city + "\nВозоаст: " +
                        "" + age + "\nХобби: " + hobby + "\n");
                break;
            case 2:
                System.out.println("Человек по имени " + name + " живет в городе " + city + ".\n" +
                        "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n");
                break;
            case 3:
                System.out.println(name + " - имя\n" + city + " - город" +
                        "\n" + age + " - возраст\n" + hobby + " - хобби");
                break;
            case 4:
                System.out.println("Вариант 1 табличный: ");
                System.out.println("Имя:     " + name);
                System.out.println("Город:   " + city);
                System.out.println("Возраст: " + age);
                System.out.println("Хобби:   " + hobby);
                System.out.println("");
                System.out.println();

                System.out.println("Вариант 2 текстовый");
                System.out.println("Человек по имени " + name + " живет в городе " + city);
                System.out.println("Этому человеку " + age + " лет и любит  " + hobby);
                System.out.println("");
                System.out.println();

                System.out.println("Вариант 3 иной");
                System.out.println(name + " - Имя");
                System.out.println(city + " - Город проживания");
                System.out.println(age + " - Возраст");
                System.out.println(hobby + " - Хобби");
                System.out.println();

                break;
            default:
                System.out.println("Нет такого варианта");
                output(name, city, age, hobby);
                break;

        }

    }
}