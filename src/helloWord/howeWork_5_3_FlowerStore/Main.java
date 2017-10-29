package helloWord.howeWork_5_3_FlowerStore;


public class Main {

    public static void main(String[] args) {

        FlowerStore flowerStore = new FlowerStore();
        Flowers[] bucket = flowerStore.sell(2,8,3);
        for (int i = 0; i < bucket.length; i++) {
            System.out.print(bucket[i].getClass().getSimpleName()+", ");
        }
        System.out.println();

        flowerStore.sell(5,18,4);

        //FlowerStore flowerStore1 = new FlowerStore();
        //flowerStore1.sell(12,11,8);


        flowerStore.getKoshelek();
        System.out.println(flowerStore.getKoshelek());
        //System.out.println(flowerStore1.getKoshelek());


        }
}
