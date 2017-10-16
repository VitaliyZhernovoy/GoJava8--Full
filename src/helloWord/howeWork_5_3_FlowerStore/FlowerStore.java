package helloWord.howeWork_5_3_FlowerStore;


public class FlowerStore {
    static int rouse = 50;
    static int chamomile = 70;
    static int tulip = 90;
    static int[] bouquetOfFlowers = {rouse,chamomile,tulip};


    public static void sell(int rouse, int chamomile, int tulip){

        int[] sell = {rouse,chamomile,tulip};
        int sum = 0;
        for(int i = 0; i < bouquetOfFlowers.length; i++) {
            sum = sum + sell[i];
        }
        System.out.println("Цветов в букете " + sum);

    }
    public static void pocket (int rouse,int chamomile,int tulip){
        double cashbox;
        Flowers flowers = new Flowers();
        cashbox = ((rouse * flowers.getPriceRose())
                + (chamomile * flowers.getPriceChamomile())
                + (tulip * flowers.getPriceTulip()) );
        System.out.println();

        System.out.println("Касса магазина : " + cashbox + "грн");

    }


    public static void main(String[] args) {
        Flowers flowers = new Flowers();

        FlowerStore.sell(2,8,9);
        FlowerStore.sell(5,18,4);
        FlowerStore.sell(12,11,8);

        System.out.println();

//        flowers.getPriceRose();
//        flowers.getPriceChamomile();
//        flowers.getPriceTulip();

        pocket(rouse,chamomile,tulip);


    }

}
