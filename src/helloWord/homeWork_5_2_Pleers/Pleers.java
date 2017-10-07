package helloWord.homeWork_5_2_Pleers;


public abstract class Pleers {

    protected String pleerName = "Default";
    protected String[] playlist = {"Песня 1","Песня 2","Песня 3","Песня 4","Песня 5"};
    protected final int price;
    protected String valuta = "грн";


    public String getPleerName()  {
        return pleerName;
    }

    public String getPrice() {

        System.out.print("Цена этого плеера: " + price);
        return this.valuta ;
    }

    public Pleers(int price, String pleerName, String playlist){
        this.pleerName = pleerName;
        this.price = price;

    }

}


