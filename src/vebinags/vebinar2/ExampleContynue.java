package vebinags.vebinar2;


public class ExampleContynue {
    public static void main(String[] args) {

        //            Оператор continue
        int a = 0;
        while (a < 5) {
            a++;
            if (a == 3){
                continue; //  В этом месте мы пропускаем вывод значения  консоль
            }
            System.out.println("а равно : " + a);
        }
        System.out.println("Программа завершилась");

    }

}


