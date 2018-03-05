package vebinags.vebinar2;


import java.util.Scanner;

public class ExampleBrake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        Оператор brake

            while (true) {

                try {
                    System.out.println("ведите число");
                    int i = sc.nextInt();
                    break;

                } catch (Exception e) {
                    sc.nextLine();
                }

            }
        System.out.println("Программа завершилась");

        }

    }



