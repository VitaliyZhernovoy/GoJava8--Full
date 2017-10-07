package helloWord.homeWork_5_2_Pleers;


import java.util.Arrays;

public class PleerFive extends PleerThree{

    protected PleerFive(int price, String pleerName, String playlist) {
        super(price, pleerName, playlist);
        super.description = "Этот плеер может проиграть первую песню и весь плейлист на оборот";
    }
    @Override
    public  void playAllSongs() {
        System.out.println("Реверс плейлиста: " );

        for (int i = playlist.length-1; i >= 0 ; i--) {
            System.out.println(playlist[i]);

        }
    }
}
