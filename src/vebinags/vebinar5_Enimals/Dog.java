package vebinags.vebinar5_Enimals;


public class Dog {

    private int age;
    public String name = "Бобик";
    //public - доступ откуда угодно
    //private - доступ только из текущего класса
    //protected - работает подобно private


    
    public Dog(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Неверный возраст!!!");
        }
        this.age = age;
    }

    public  int getAge() {
        return  age;
    }
    public void showInfo() {
        System.out.println("Собаку зовут: " + name);
        System.out.println("Собаке " + age + " лет");
    }
}
