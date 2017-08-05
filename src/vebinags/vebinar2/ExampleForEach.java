package vebinags.vebinar2;


public class ExampleForEach {
    public static void main(String[] args) {
        int[] cars = new int[10];

//        задаем значение для массива
        for (int i = 0; i < cars.length; i++)
            cars[i] = i;

//        foreach который может только считывать, выводим в консоль весь массив

        for (int car : cars) {
            System.out.println(car);

        }
    }
}
