package lessons.generic;


import vebinags.vebinar5_3extends_enimals.Cat;

public class Dog <T> {
    public String name;
    public Cat obj;
    public int age;
    public int getAge;

    public Dog(Object name, int i) {

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public Cat getObj() {
        return obj;
    }

}
