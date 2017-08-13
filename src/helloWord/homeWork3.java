package helloWord;


import java.util.Arrays;
import java.util.Scanner;

public class homeWork3 {


    public static void main(String[] args) {

//
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size


        int[] array = new int[size];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for (int element : array) {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = in.nextInt();

            System.out.println("вы ввели  " + array[i]);

            i++;

        }

        System.out.print("Ваш массив: ");

        for (int element : array)

            System.out.print(element + " ");
        System.out.println("");


        int min;
        int max;
        int sorting;
        min = min(array);
        max = max(array);
        sorting = sorting(array);



    }


    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];

        }
        System.out.println("Минимальное число массива int = " + min);

        return min;


    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];

        }
        System.out.println("Максимальное число массива int = " + max);
        return max;

    }

    public static int sorting(int[] array) {
        int sorting = 0;
        Arrays.sort(array);

        System.out.println("отсортированный массив = " + Arrays.toString(array));
        
        return sorting;

    }
}









