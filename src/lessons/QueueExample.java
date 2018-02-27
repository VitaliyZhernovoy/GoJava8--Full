package lessons;

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();

        // queue.push(1);   // добавляет
        // queue.peek();       // считывает первый элемент
        // queue.poll();       // считывает первый элемент + удаляет

        // queue.pop();        // считывает по типу Stack + удаляет

        int x = 1;

        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));

        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());
        System.out.println(queue.pollLast());

        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));

        System.out.println(queue.pollLast());

        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));

        System.out.println(queue.pollLast());

        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));
        queue.push(x++); System.out.println("add " + (x -1));

        while (!queue.isEmpty()){
            System.out.println(queue.pollLast());
        }
    }
}
