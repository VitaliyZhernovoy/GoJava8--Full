package trenings;


public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 2, 3, 3};

        int maxCopyes = 0;

        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                    //System.out.print("+" + " ");
                }
                //System.out.println();
            }
//                              выводим максимальное число повторений одного числа из массива
            maxCopyes = maxCopyes < counter ? counter : maxCopyes;


        }
        System.out.println("максимально повторений:  " + maxCopyes  );
    }
}
