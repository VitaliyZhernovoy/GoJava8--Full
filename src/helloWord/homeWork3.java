package helloWord;


import java.util.Scanner;

public class homeWork3 {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in); // Объявляем Scanner
//        System.out.println("Enter array length: ");
//        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
//        int array[] = new int[size]; // Создаём массив int размером в size
//        System.out.println("Insert array elements:");
//    /*Пройдёмся по всему массиву, заполняя его*/
//        for (int i = 0; i < size; i++) {
//            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
//        }
//        System.out.print ("Inserted array elements:");
//        for (int i = 0; i < size; i++) {
//            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//        }
//        System.out.println();
//       }
//    }
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size

        int[] array = new int[size];
        int i = 0;
        Scanner in = new Scanner(System.in);

        for (int element : array) {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = in.nextInt();

            System.out.println("вы ввели  " + array[i] );

            i++;

        }
        System.out.print("Ваш массив: ");

        for (int element : array)


            System.out.print(element + " ");

    }


}

