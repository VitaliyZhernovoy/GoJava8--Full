package offlanes;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner

        System.out.print("Введите первое число: ");
        sc.hasNextInt();
        int a = sc.nextInt();

        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        int tmp = a;
        a=b;
        b = tmp;

        System.out.println(a);
        System.out.println(b);


    }
}





