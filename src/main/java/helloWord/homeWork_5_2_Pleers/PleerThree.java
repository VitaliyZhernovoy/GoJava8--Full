package helloWord.homeWork_5_2_Pleers;


import java.util.Arrays;



public class PleerThree extends PleerOne  {


    protected PleerThree(int price,String pleerName, String playlist ) {
            super(price,pleerName, playlist);
            super.description="Этот плеер может проиграть первую песню и весь плейлист";
        }

    public  void playAllSongs() {
        System.out.println("Сейчас играет плейлист - " + Arrays.toString(playlist));
    }
}
