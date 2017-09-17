package helloWord.car_saloon;

import java.util.Scanner;

    public class Common {

        public static int getNumericData(Scanner in, String Text) {

            System.out.printf(Text);

            while (in.hasNextInt()) {
                return in.nextInt();
            }
            return 0;
        }

        public static float getNumericFractionalData(Scanner in, String Text) {

            System.out.printf(Text);

            while (in.hasNextFloat()) {
                return in.nextFloat();
            }
            return 0;
        }

    }

