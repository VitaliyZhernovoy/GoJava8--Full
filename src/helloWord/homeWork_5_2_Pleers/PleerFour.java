package helloWord.homeWork_5_2_Pleers;

/**
 * Created by Оля on 04.10.2017.
 */
public class PleerFour extends PleerThree {


    protected PleerFour(int price, String pleerName, String playlist) {
        super(price, pleerName, playlist);
        super.description="Этот плеер может проиграть последнюю песню и весь плейлист";
    }
    @Override
    public void playSong() {
        System.out.println("играет плеер - " + super.pleerName);
        System.out.println(description);
        System.out.println("Сейчас играет последняя композиция - " + (super.playlist.length-1));
    }


}
