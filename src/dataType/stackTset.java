package dataType;

import java.util.Stack;


public class stackTset {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        System.out.println(a);
        a.push(11);
        a.push(22);
        a.push(33);
        System.out.println("print whole stack: " + a);
        System.out.println("peek on top: " + a.peek());
        System.out.println("search: " + a.search(22));
        System.out.println("search: " + a.search(55));
        System.out.println("pop out: " + a.pop());
    }
}
