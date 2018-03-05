package helloWord.homeWork_5_2_Pleers;


public class PleerToo extends PleerOne {

    protected PleerToo(int price, String pleerName, String playlist) {
        super(price, pleerName, playlist);
    }

    @Override
    public  void playSong() {
        System.out.println("играет плеер - " + pleerName);

        System.out.println("Этот плеер может проиграть только первую песню плейлиста с ошибкой");
        System.out.println("Не могу проиграть:  " + " error ");
    }
}
