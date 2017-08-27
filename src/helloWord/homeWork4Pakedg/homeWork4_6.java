package helloWord.homeWork4Pakedg;

// Решить задачу 2, без использования циклов. Использовав рекурсию.


public class homeWork4_6 {

        static int numWidth = 1;
        static int numHeight = 1;

        public static void main(String... args) {
            int width = 1 + (int) (Math.random() * 7);
            int height = 1 + (int) (Math.random() * 7);
            drawRectangle(width, height);
        }
        public static void drawRectangle(int width, int height) {
            char plus = '+';
            System.out.print(plus + " ");
            numWidth++;
            if (numWidth <= width){
                drawRectangle(width, height);
            }
            numHeight++;
            if(numHeight <= height){
                numWidth = 1;
                System.out.println();
                drawRectangle(width, height);
            }
        }
    }

