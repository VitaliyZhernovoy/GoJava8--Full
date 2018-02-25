package helloWord.homeWork_6.linkedList;


public class MyNode<T> {
    public T item;
    public MyNode<T> next;
    public MyNode<T> prev;

    public MyNode(T item, MyNode<T> next, MyNode<T> prev) {
        this.item = item;
        this.next = next;
        this.prev = prev;
    }
}
