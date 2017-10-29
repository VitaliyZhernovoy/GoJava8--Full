package helloWord.howeWork_5_3_FlowerStore.store;

import helloWord.howeWork_5_3_FlowerStore.flowers.Flowers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlowersLoader {

    public FlowersLoader(){}

    Flowers[] bucket;

    public Flowers load(String path){
        try {
            path = "files/store.txt";
            FileWriter writer = new FileWriter("files/store.txt");
            for (Flowers value : bucket){
                writer.write( "" + value + " ");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Flowers flowerBouquet = new Flowers() ;
        BufferedReader br = null;
        FileReader fr = null;
        int countRose = 0, countChamomile = 0, countTulip = 0;

        return flowerBouquet;

    }

}
