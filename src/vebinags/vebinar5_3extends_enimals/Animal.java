package vebinags.vebinar5_3extends_enimals;


import vebinags.vebinar5_3extends_enimals.interf.IDrink;

public abstract class Animal implements IDrink {
    public String mame = "default";
    private int age = 5; // доступ имеет только этот клас
    protected int weight = 10;


    //private  доступ имеет только этот клас
    // protected доступ есть у этого класса и у классов- детей

    public Animal(String name,int age,int weight){
        this.mame = name;
        this.age = age;
        this.weight = weight;
    }

    public  void showAge() {
        System.out.println(age);
    }

    public  void showWeight() {
        System.out.println(weight);
    }

    //перегрузка метода showWeight()
    public void setWeight (String message){
        System.out.println(message + weight);
    }

    public abstract void run();
}

