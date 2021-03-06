package helloWord.howeWork_5_3_FlowerStore;

import helloWord.howeWork_5_3_FlowerStore.flowers.Flowers;
import helloWord.howeWork_5_3_FlowerStore.store.FlowerStore;
import helloWord.howeWork_5_3_FlowerStore.store.FlowersLoader;

public class Main {





    public static void main(String[] args) {

        String fileName="src\\main\\java\\helloWord\\howeWork_5_3_FlowerStore\\flowers\\files\\take_count_flowers";

        System.out.println("Букет из лоадера: ");
        showBucket(FlowersLoader.readFromFile(fileName));


        FlowerStore flowerStore = new FlowerStore();
        //ЭТОТ БУКЕТ ЗАПИСАТЬ В ФАИЛ
        Flowers[] bucket = flowerStore.sell(2,8,3);
        showBucket(bucket);



        Flowers[] bucket1 = flowerStore.sell(5,18,4);
        for (int i = 0; i < bucket1.length; i++) {
            System.out.print(bucket1[i].getClass().getSimpleName() + ", ");
        }
        System.out.println();

        Flowers[] bucket2 = flowerStore.sell(12,11,8);
        for (int i = 0; i < bucket2.length; i++) {
            System.out.print(bucket2[i].getClass().getSimpleName() + ", ");
        }


        System.out.println();
        System.out.println();


        flowerStore.getKoshelek();
        System.out.println("Выручка магазина составляет: " + flowerStore.getKoshelek() + "грн.");
        }

        public static void showBucket (Flowers[]bucket){
            for (int i = 0; i < bucket.length; i++) {
                System.out.print(bucket[i].getClass().getSimpleName() + ", ");
            }
            System.out.println();
        }
}
