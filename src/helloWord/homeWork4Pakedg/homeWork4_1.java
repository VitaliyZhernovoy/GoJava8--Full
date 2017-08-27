package helloWord;


public class homeWork4 {
    /**
     * Created by Евгений on 21.07.2017.
     */
/* Написать функцию которая считает в консоли до числа Х. Аргументы функции: число Х Например Х = 5. Вывод
программы: 1 2 3 4 5  */


        public static void main(String[] args) { // (String[] args) заменил на  (String... args) чтоб в 7
            int x = (int) (Math.random() * 30);   // класе вызывать этот метод и не писать
            count(x);                             // One.main(new String[0]); а просто One.main(); Можно еще в
        }                                         // мейне аргумент убрать но тогда класс отдельно работать не
        public static void count(int x) {         // будет
            for(int i = 1; i <= x; i++){
                System.out.print(i + " ");
            }
        }
    }

