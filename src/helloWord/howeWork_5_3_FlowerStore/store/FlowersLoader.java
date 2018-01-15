package helloWord.howeWork_5_3_FlowerStore.store;

import helloWord.howeWork_5_3_FlowerStore.flowers.Flowers;

import java.io.*;

public class FlowersLoader {

    protected FlowersLoader(){}

    public static Flowers[] readFromFile(String fileName) {
        int countRose =  0;
        int countTulip = 0;
        int countChamomile = 0;
        Flowers[] bucket = null;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String line = bf.readLine();

            while (line != null){
                //System.out.println(line + "/");

                String[] listStr = line.split(" ");
                int count = Integer.parseInt(listStr[1]);
                // если ромашка значит countChamomile = count;
                //System.out.println(listStr[1]);

                if( listStr[0].equals("Chamomile")){
                countChamomile = count;
                }
                if (listStr[0].equals("Rose") ) {
                    countRose = count;
                }
                if (listStr[0].equals("Tulip") ) {
                    countTulip = count;
                }

                line = bf.readLine();
            }

            FlowerStore flowerStore = new FlowerStore();
            bucket = flowerStore.sell(countRose,countChamomile,countTulip);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bucket;
    }


}
