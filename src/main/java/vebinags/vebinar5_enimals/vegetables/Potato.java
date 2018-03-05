package vebinags.vebinar5_enimals.vegetables;


public class Potato {
    public  int releaseDate = 5;
    public  int outDate = 10;

    private boolean readyToEat;

    public void refreshParams(int day) {
//        if (day < releaseDate + outDate) {
//            readyToEat = true;
//
//        }else {
//            readyToEat = false;
//        }
        readyToEat = day < releaseDate + outDate;
    }


    public boolean getRedyToEat() {
        return readyToEat;
    }

}
