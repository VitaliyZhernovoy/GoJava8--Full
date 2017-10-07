package helloWord.homeWork_5_2_Pleers;


public class PleerOne extends Pleers  {

    protected PleerOne(int price,String pleerName, String playlist ) {
        super(price, pleerName,playlist);

    }
    String description = "Этот плеер может проиграть толькл первую песню плейлиста";


    public  void playSong() {

        System.out.println("играет плеер - " + super.pleerName);
        System.out.println(description);
        System.out.println("Сейчас играет композиция - " + super.playlist[0]);
    }

}
