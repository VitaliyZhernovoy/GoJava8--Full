package helloWord.howeWork_5_3_FlowerStore;


public class Flowers {
    int priceRose = 100;
    int priceChamomile = 70;
    int priceTulip = 45;

    public int getPriceRose() {
        System.out.println("Роза стоит : " + priceRose + "грн.");
        return priceRose;
    }

    public int getPriceChamomile() {
        System.out.println("Ромашка стоит : " + priceChamomile + "грн.");
        return priceChamomile;
    }

    public int getPriceTulip() {
        System.out.println("Тюльпан стоит : " + priceTulip + "грн.");
        return priceTulip;
    }
}
