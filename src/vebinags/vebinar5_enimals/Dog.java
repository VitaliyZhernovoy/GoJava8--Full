package vebinags.vebinar5_enimals;


public class  Dog {

    //============= ПЕРЕМЕННЫЕ ===========================
    //====================================================
    //public - доступ откуда угодно
    //private - доступ только из текущего класса
    //protected - работает подобно private


    private int age;
    public String name = "Бобик";
    private int weight = 10;

    //============= КОНСТРУКТОРЫ =========================
    //====================================================

    public Dog(){

    }

    public Dog(String name) {
        this(name,2,20);
    }

    public Dog (String name, int age){
        this(name, age, 10);

    }

    public Dog (String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    //============= МЕТОДЫ ===============================
    //====================================================
    public void showInfo() {
        System.out.println("Собаку зовут: " + name);
        System.out.println("Собаке " + age + " лет");
    }


    //============= ГЕТТЕРЫ И СЕТТЕРЫ ====================
    //====================================================
    //сеттер возраста
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Неверный возраст!!!");
        } else {
            this.age = age;
        }

    }
    //геттер возраста
    public  int getAge() {
        return  age;
    }
    //----------------------------------------------------

    //доступ к весу собаки--------------------------------
    public int getWeight(){

        return weight;
    }
    //----------------------------------------------------

}
