package helloWord.homeWork4Pakedg;

// Решить задачу 1, без использования циклов. Использовав рекурсию.

public class homeWork4_5 {

    static int num = 1 ;
        public static void main(String... args) {
            int x = 1 + (int) (Math.random() * 40);
            count(x);
        }
        public static void count(int x ) {
            System.out.print(num++ + " ");
            if (num <= x){
                count(x);
            }
        }
    }


