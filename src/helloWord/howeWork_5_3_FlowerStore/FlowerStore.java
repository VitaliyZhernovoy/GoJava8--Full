package helloWord.howeWork_5_3_FlowerStore;


public class FlowerStore {
    static int[] countRouse = {50};
    static int[] countChamomile = {70};
    static int[] countTulip = {90};
    static int[] bouquetOfFlowers = {50,70,90};


    public static void sell(int rouse, int chamomile, int tulip){

        int[] sell = {rouse,chamomile,tulip};
        int sum = 0;
        for(int i = 0; i < bouquetOfFlowers.length; i++) {
            sum = sum + sell[i];
        }
        System.out.println("Цветов в букете " + sum);

    }


    public static void main(String[] args) {
        FlowerStore.sell(2,8,9);
        FlowerStore.sell(5,18,4);
        FlowerStore.sell(12,11,8);

    }

}
