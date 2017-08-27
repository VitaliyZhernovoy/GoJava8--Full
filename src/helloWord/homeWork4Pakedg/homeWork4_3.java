package helloWord.homeWork4Pakedg;

/* Перегрузить функцию drawRectangle (задание 2) таким образом, что бы она могла принимать на вход только 1
параметр (ширина квадрата) и рисовать квадрат с равными сторонами Например 2 Вывод программы: + + + +
Например 3 Вывод программы: + + + + + + + + +  */


public class homeWork4_3 {
    public static void main(String... args) {
        int width = 7 + (int) (Math.random() * 7 );
        int height = 5 + (int) (Math.random() * 7);
        drawRectangle(width, height);
        System.out.println("Следующий квадрат только с одним параметром высота");
        drawRectangleOverload(width);
    }
    public static void drawRectangle(int width, int height) {
        char plus = '+';
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(plus + " ");
            }
            System.out.println();
        }
    }
    public static int drawRectangleOverload(int width) {
        char plus = '+';
        for (int i = 0; i < width ; i++){
            for (int j = 0; j < width; j++) {
                System.out.print(plus + " ");
            }
            System.out.println();
        }
        return 0;
    }
}

