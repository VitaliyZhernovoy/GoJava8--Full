package helloWord.homeWork4Pakedg;
import java.util.Scanner;

   /* Написать программу, в которой выполнены все шесть предыдущих заданий. Каждое задание выполняется в
отдельной функции. В пределах этой же функции происходит ввод с консоли необходимых данных. Программа
спрашивает пользователя какую задачу он хочет решить (от 1 до 6). Затем программа вызывает соответствующую
функцию для решения этой задачи. По окончанию решения задачи, программа спрашивает пользователя, хочет ли
он продолжить решать задачи. Если да - опять спрашивает какую задачу.
 */


public class homeWork4_7 {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("какую задачу вы хотите решить (от 1 до 6)?");
            int num = s.nextInt();
            switch (num){
                case 1:
                    homeWork4_1.main();
                    txt();
                    break;
                case 2:
                    homeWork4_2.main();
                    txt();
                    break;
                case 3:
                    homeWork4_3.main();
                    txt();
                    break;
                case 4:
                    homeWork4_4.main();
                    txt();
                    break;
                case 5:
                    homeWork4_5.main();
                    txt();
                    break;
                case 6:
                    homeWork4_6.main();
                    txt();
                    break;
                default:
                    break;
            }
        }
        private static void txt() {
            System.out.println();
            System.out.println("хотите продолжить решать задачи?" + "\n" + "Введите да или нет");
            Scanner s = new Scanner(System.in);
            String txt = s.next();
            if (txt.equals("да")) {
                main(new String[0]);

            } if (txt.equals("да") && txt.equals("нет") !=true )
                System.out.println("Вы ввели не верную команду");
           //main(new String[0]);



            if (txt.equals("нет")) {
                System.out.println("Спасибо за внимание!");

            }
        }
}






