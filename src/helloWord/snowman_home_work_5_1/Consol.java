package helloWord.snowman_home_work_5_1;
import java.util.Scanner;



    public class Consol {
        private static Scanner scanner = new Scanner(System.in);
        public static int readInt (String mes) {
            System.out.println(mes);
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Введите целое число");
                return readInt(mes);
            }
        }

        public static double readDouble (String mes) {
            System.out.println(mes);
            try {
                return scanner.nextDouble();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Введите целое число");
                return readDouble(mes);
            }
        }
    }

