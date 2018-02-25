package helloWord.homeWork_6.myHashMap;


public class MyHashMap<T,K> {
    private MyNodeHM<T,K> first = null;
    private MyNodeHM<T,K> last = null;
    private int size = 0;

    public void put(T key, K value) {
        MyNodeHM<T,K> node;
        if(first == null){
            node = new MyNodeHM<>(key, value, null);
            first = node;
            last = node;
            size++;
        } else {
            node = new MyNodeHM<>(key, value, null);
            last.next = node;
            last = node;
            size++;
        }
    }

    public void remove(T key) {
        MyNodeHM<T,K> node = getNode(key);
        MyNodeHM<T,K> nodePrev = getPrevNode(key);

        if (nodePrev == null){
            first = node.next;
            node.next = null;
            node.key = null;
            node.value = null;
            size--;
        } else if(node.next == null) {
            nodePrev.next = null;
            last = nodePrev;
            node.key = null;
            node.value = null;
            size--;
        } else {
            nodePrev.next = node.next;
            node.next = null;
            node.key = null;
            node.value = null;
            size--;
        }
    }

    public void clear() {
        MyNodeHM<T,K> iterator = first;
        while (iterator != null){
            if(iterator.next != null){
                MyNodeHM<T,K> nextNode = iterator.next;
                iterator.value = null;
                iterator.key = null;
                iterator.next = null;
                iterator = nextNode;
            } else {
                iterator.value = null;
                iterator.key = null;
            }
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public K get(T key) {
        return getNode(key).value;
    }

    protected MyNodeHM<T,K> getNode(T key){
        MyNodeHM<T,K> iterator = first;
        while (iterator != null){
            if(iterator.key.equals(key))
                return iterator;
            iterator = iterator.next;
        }
        return null;
    }

    protected MyNodeHM<T,K> getPrevNode(T key){
        MyNodeHM<T,K> iterator = first;
        while (iterator != null){
            if(iterator.next != null && iterator.next.key.equals(key))
                return iterator;
            iterator = iterator.next;
        }
        return null;
    }
}
