package lessons;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //LIFO

        // stack.pop(); //считать + удалить
        // stack.push();   // cчитать

        stack.push(1);
        stack.push(2);
        stack.push(3);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
