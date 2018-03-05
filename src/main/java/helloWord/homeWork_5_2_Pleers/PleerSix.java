package helloWord.homeWork_5_2_Pleers;

import java.util.Arrays;
import java.util.Random;


public class PleerSix extends PleerThree {
    protected PleerSix(int price, String pleerName, String playlist) {
        super(price, pleerName, playlist);
    }

    @Override
    public void playSong() {
        System.out.println("играет плеер - " + super.pleerName);
        System.out.println(description = "Этот плеер может проиграть первую песню,весь плейлист и в случайном порядке");
        System.out.println("Сейчас играет первая композиция - " + (super.playlist[0]));
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 1; i < playlist.length; i++) {
            int j = random.nextInt(i);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }

        System.out.println("Сейчас играет плейлист в случайном порядке - " + Arrays.toString(playlist));

    }

}
