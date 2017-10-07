package helloWord.homeWork_5_2_Pleers;


import java.util.Arrays;

public class PleersProgram {
    public static void main(String[] args) throws InterruptedException{
        PleerOne pleerOne = new PleerOne(550,"Nano","Popsa");
        PleerToo pleerToo = new PleerToo(800,"Ipod","Dzhaz");
        PleerThree pleerThree = new PleerThree(900,"Sansa","Popsa2");
        PleerFour pleerFour  = new PleerFour(1400,"Samsung", "List4");
        PleerFive pleerFive = new PleerFive(1900,"Asus", "List5");
        PleerSix pleerSix = new PleerSix(2000,"Meizu","List6");

        System.out.println(pleerOne.getPrice());
        pleerOne.playSong();
        System.out.println("---------------------------");
        System.out.println(pleerToo.getPrice());
        pleerToo.playSong();
        System.out.println("---------------------------");
        System.out.println(pleerThree.getPrice());
        pleerThree.playSong();
        pleerThree.playAllSongs();
        System.out.println("---------------------------");
        System.out.println(pleerFour.getPrice());
        pleerFour.playSong();
        pleerFour.playAllSongs();
        System.out.println("---------------------------");
        System.out.println(pleerFive.getPrice());
        pleerFive.playSong();
        pleerFive.playAllSongs();
        System.out.println("---------------------------");
        System.out.println(pleerSix.getPrice());
        pleerSix.playSong();
        pleerSix.playAllSongs();
        pleerSix.shuffle();
        //pleerSix.playAllSongs();

    }

}

