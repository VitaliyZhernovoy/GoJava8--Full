package helloWord.howeWork_5_3_FlowerStore;



public class FlowerStore {

    private int koshelek = 0;

    public int getKoshelek() {
        return koshelek;
    }
    private void calculateKoshelek(Flowers[] bucket){
        for (int i = 0; i < bucket.length; i++) {
            koshelek = koshelek + bucket[i].getPrice();
        }
    }

    public  Flowers[] sell(int countRouse, int countChamomile, int countTulip){

        Flowers[] bouket = new Flowers[countChamomile + countRouse + countTulip];


//        for(int i = 0; i < countRouse; i++) {
//            Rose rose = new Rose();
//            bouket[i] = rose;
//        }
//
//        for(int i = countRouse; i < countChamomile + countRouse; i++) {
//            Chamomile chamomile = new Chamomile();
//            bouket[i] = chamomile;
//        }
//
//        for(int i = countRouse + countChamomile; i < bouket.length; i++) {
//            Tulip tulipe = new Tulip();
//            bouket[i] = tulipe;
//        }

// varian 2
        for (int i = 0; i < bouket.length; i++) {
            if (countRouse != 0) {
                Rose rose = new Rose();
                bouket[i] = rose;
                countRouse--;
            } else if (countChamomile != 0) {
                Chamomile chamomile = new Chamomile();
                bouket[i] = chamomile;
                countChamomile--;
            } else {
                Tulip tulipe = new Tulip();
                bouket[i] = tulipe;
            }
        }

        calculateKoshelek(bouket);
        System.out.println("Цветов в букете " + bouket.length);

    return bouket;
    }
}

