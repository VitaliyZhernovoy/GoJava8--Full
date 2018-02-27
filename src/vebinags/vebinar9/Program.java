package vebinags.vebinar9;


import vebinags.vebinar9.generic.GenericArray;
import vebinags.vebinar9.generic.GenericChild;
import vebinags.vebinar9.generic.linkedList.MyLinkedList;

import java.util.*;


public class Program {
    //ФУНКЦИЯ КОТОРАЯ УВЕЛИЧИВАЕТ МАССИВ В РАЗМЕРЕ (ресайз массива + ОДИН ЭЛЕМЕНТ)
    static int[] addElemeent(int[] array) {
        int[] arrayBigger = new int[array.length + 1];
        System.arraycopy(array, 0, arrayBigger, 0, array.length);
        return arrayBigger;
    }



//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    static void printCollection(Collection collection) {
        for (Object element : collection) {
            System.out.print("" + element + " ");
        }
        System.out.println();
    }

    //ArrayList example

    static void arrayListExample(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(i + 1);
        }

        printCollection(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            stringArrayList.add("s:" + i + 1);
        }
        printCollection(stringArrayList);
    }

    static void linkedListExample(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("str");

        MyLinkedList<String> myLinkedList = new MyLinkedList<>(new String[]{"s1", "s2", "s3"});
        myLinkedList.show();

    }

    static void stackAndQueueExample(){
        Stack<String> stringStack = new Stack<>();
        stringStack.push("1");
        stringStack.push("2");
        stringStack.push("3");
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    static void setExample() {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(0);
        set.add(0);
        set.add(2);
        set.add(0);
        printCollection(set);
    }

    static void mapExample() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Коля", 20);
        map.put("Вася", 25);
        map.put("Маша", 19);
        map.put("Коля", 30);  //перезапись значения
        map.put("Коля", 40);  //перезапись значения
        map.put("Коля", 35);  //перезапись значения

        System.out.println(map.get("Коля"));
        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }





    public static void main(String[] args) {

        // Примеры дженериков
        //int[] intArray= new int[10];
        //ArrayList<Integer> integersArray = new ArrayList<Integer>();
        GenericArray<String, String> genericArray = new GenericArray<>("sdsfrfvsvv");


        GenericChild genericChild = new GenericChild(10);


        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
//        array2.add("ooops");
//        String str = array2.get(0);
//        System.out.println(str);


        //коллекции
        arrayListExample();
        linkedListExample();
        stackAndQueueExample();
        setExample();
        mapExample();
    }
}
