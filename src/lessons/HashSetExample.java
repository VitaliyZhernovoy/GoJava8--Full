package lessons;

import vebinags.vebinar5_3extends_enimals.Dog;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Оля on 11.02.2018.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(4);

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            Integer x = iterator.next();
            System.out.println(x);
        }
    }
}
