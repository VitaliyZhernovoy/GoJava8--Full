package vebinags.vebinar2;


public class ExampleArraySort {
    public static void main(String[] args) {
        int[] cars = new int[] {5, 1, 3, 2, 4,};

// сортировка пузырьком

        for (int i = 0; i < cars.length; i++){
            for (int j = 1; j < (cars.length -i  ); j++) {
                if (cars[j-1] > cars[j]) {
                    int temp = cars[j - 1];
                    cars[j-1] = cars[j];
                    cars[j] = temp;
                }

            }
            
        }
        for (int car : cars) {
            System.out.println(car);
            
        }


    }

}
