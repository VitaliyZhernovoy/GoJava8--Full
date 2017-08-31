package vebinags.vebinar5_Enimals;


public class Dog {

    private int age;
    public String name = "Бобик";
    //public - доступ откуда угодно
    //private - доступ только из текущего класса
    //protected - работает подобно private



    public Dog(){

    }


    public Dog(String name) {
        this.name = name;
    }
    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    //сеттер возраста
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Неверный возраст!!!");
        } else {
            this.age = age;
        }
    }
    //г еттер возраста
    public  int getAge() {
        return  age;
    }
    public void showInfo() {
        System.out.println("Собаку зовут: " + name);
        System.out.println("Собаке " + age + " лет");
    }

}
