package helloWord.homeWork_6.myHashMap;


public class MyNodeHM <T,K> {
    public T key;
    public K value;
    public MyNodeHM<T,K> next;

    public MyNodeHM(T key, K value, MyNodeHM<T, K> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
