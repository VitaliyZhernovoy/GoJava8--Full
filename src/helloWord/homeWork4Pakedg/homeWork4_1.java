package helloWord.homeWork4Pakedg;


public class homeWork4_1 {

/* Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод
программы: 1 2 3 4 5  */


        public static void main(String... args) {
            int x = (int) (Math.random() * 30);
            count(x);
        }
        public static void count(int x) {
            for(int i = 1; i <= x; i++){
                System.out.print(i + " ");
            }
        }
    }

