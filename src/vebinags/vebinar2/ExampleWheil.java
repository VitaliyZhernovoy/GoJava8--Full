package vebinags.vebinar2;


import java.util.Scanner;

public class ExampleWheil {
    public static void main(String[] args) {
        int[] cars = new int[5];

        Scanner sc = new Scanner(System.in);
        cars[0] = 10;
        cars[1] = 11;
        cars[2] = 12;
        cars[3] = 13;
        cars[4] = 14;
        int a = cars[3];

        System.out.println(cars[0] + " ; " + cars[1] + " ; " + cars[2] + " ; " + cars[3] + " ; " + cars[4]);
        System.out.println(a);

        int index = 0;
        while (index < cars.length) {
            cars[index] = 10 + index;
            System.out.println(cars[index]);
            index++;

        }
    }
}
