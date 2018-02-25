package helloWord.homeWork_6.queue;


import helloWord.homeWork_6.Lists;
import helloWord.homeWork_6.linkedList.MyLinkedList;

public class MyQueue<T> extends MyLinkedList<T> implements Lists<T> {

    public T peek() {
        return getNode(0).item;
    }

    public T poll() {
        T nodeVal = getNode(0).item;
        remove(0);
        return nodeVal;
    }

}
