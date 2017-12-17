package helloWord.howeWork_5_3_FlowerStore.store;

import helloWord.howeWork_5_3_FlowerStore.flowers.Flowers;

import java.io.*;

public class FlowersLoader {

    Flowers[] bucket;
    //String fileName="src"+File.separator+"helloWord"+ File.separator+"homeWork_5_3_FlowerStore"+File.separator+"take_count_flowers.txt";

    String fileName="C:\\Users\\Оля\\IdeaProjects\\GoJava8--Full\\src\\helloWord\\howeWork_5_3_FlowerStore\\take_count_flowers";
    public FlowersLoader(){
        readFromFile(fileName);
    }

    private void readFromFile(String fileName) {
        int countRose =0;
        int countTulip = 0;
        int countChamomile = 0;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = bf.readLine();
            while (line != null){
                System.out.println(line);

                String[] listStr = line.split(" ");
                int count = Integer.parseInt(listStr[1]);
                // если ромашка значит countChamomile=count;
                line = bf.readLine();
            }

            FlowerStore flowerStore = new FlowerStore();
            bucket = flowerStore.sell(countRose,countChamomile,countTulip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Flowers[] getBucket() {
        return bucket;
    }
}
