package vebinags.vebinar5_enimals.strucure.furniture;


public class Table {
    private int weight;
    private Glue glue;

    public Table(){
        this.glue.name = "Клей";

    }
    //У класса Клей есть доступ к приватным классам Стола,
    // поскольку он вложен внутрь стола
    private  class Glue{
        public String name;
        public int outDate;

        public void doSomething(){
            Table.this.weight = 200;

        }
    }

}


