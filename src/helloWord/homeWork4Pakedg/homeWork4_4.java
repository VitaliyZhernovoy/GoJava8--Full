package helloWord.homeWork4Pakedg;

/* Написать функцию getMax которая принимает на вход два аргумента в виде чисел. А возврыщает максимальное
 из этих двух. Так же, необходимо перегрузить эту функцию для работы с разными числовыми типами переменных
 (int, float) */


public class homeWork4_4 {
        public static void main(String... args) {
            int numI = (int) (Math.random() * 20);
            float numF = (float) (Math.random() * 20);
            System.out.println("Максимальное число из интов : " + getMax(numI, numF));
            System.out.println("Максимальное число из интов и флоат : " + getMax ( numI,numF));
        }
        public static double getMax(int numI, int numF) {
            int max;
            if (numF > numI){
                max = numF;
            }
            else {
                max = numI;
            }
            return max;
        }
        public static double getMax(int numI, float numF) {
            float max;
            if (numF > numI){
                max = numF;
            }
            else {
                max = numI;
            }
            return max;
        }
    }
