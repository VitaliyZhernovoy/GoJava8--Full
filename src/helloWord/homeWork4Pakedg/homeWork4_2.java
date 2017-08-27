package helloWord.homeWork4Pakedg;

/* Написать функцию drawRectangle которая рисует в консоли прямоугольник из символов '+' Аргументы функции:
ширина прямугольника в символах, высота прямоугольника в символах Например 3 на 2 Вывод программы:
+ + + + + + */


public class homeWork4_2 {

    public static void main(String[] args) {
        int width = 5 + (int) (Math.random() * 7);
        int height = 5 + (int) (Math.random() * 7);
        drawRectangle(width, height);
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
}



