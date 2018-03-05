package vebinags.vebinar2;


import java.util.Scanner;

public class ExampleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = sc.nextInt();
        boolean value = i == 1;
        //if (i == 1) можно и так делать
        if (value) {
            System.out.println("Привет Виталий!");
        } else {
            System.out.println("Пока!");
            }
            System.out.println("програма продолжает выполняться");
        }
    }

