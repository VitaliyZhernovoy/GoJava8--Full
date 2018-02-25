package lessons;

import vebinags.vebinar5_3extends_enimals.Dog;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Dog> linkedList = new LinkedList<>();

        linkedList.addLast(new Dog("ddd",3,7));
        linkedList.addLast(new Dog("aa",4,11));
        linkedList.addLast(new Dog("cccc",1,4));

        Iterator<Dog> iterator =  linkedList.iterator();

        while (iterator.hasNext()){
            Dog dog = iterator.next();
            System.out.println(dog.getName);
        }

    }
}
