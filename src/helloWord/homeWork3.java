package helloWord;


import java.util.Arrays;
import java.util.Scanner;

public class homeWork3 {

  //создаем метод создания массива
public static int[] bildArray(int size1) {
    int[] array = new int[size1];
    Scanner in = new Scanner(System.in);

    for (int i = 0; i < size1; i++) {
        System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
        array[i] = in.nextInt();
    }
    //возвращаем введенный масив
    return array;
}
   // выводим получившийся массив в консоль
public static void outArray (int[] array2){

    System.out.print("Ваш массив: ");

    for (int element : array2)
        System.out.print(element + " ");
    System.out.println("");

}
public static int maxCountRepit(int[] array){
    int maxCopyes = 0;

    for (int k = 0; k < array.length; k++) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[k] == array[j]) {
                counter++;

            }
//         выводим максимальное число повторений одного числа из массива
            maxCopyes = maxCopyes < counter ? counter : maxCopyes;

        }

    }
    return maxCopyes;
}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
     // Читаем с клавиатуры размер массива и записываем в size
        int size = input.nextInt();



     // инициализируемс массив
        int[] array = bildArray(size);
     //выводим получившийся массив в консоль
        outArray(array);


        // находим мин массмва
        int  min = min(array);
        System.out.println("Минимальное число массива int = " + min);
        //находим мах массива
        int max = max(array);
        System.out.println("Максимальное число массива int = " + max);
        //выводим отсортированный массив
        sorting(array);
       //выводим максимальное повторение числа в массиве
        int maxRepit = maxCountRepit(array);
        System.out.println("максимально повторений:  " + maxRepit);

    }


    public static int min(int[] array) {
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];

        }
        return min;
    }


    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];

        }
        return max;

    }

    public static void sorting(int[] array) {

        Arrays.sort(array);

        System.out.println("отсортированный массив = " + Arrays.toString(array));

    }
}









