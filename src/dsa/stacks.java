package dsa;


import java.util.Stack;

public class stacks {

    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();

        stk.push("Lucy");
        stk.push("George");
        stk.push("Max");
        stk.push("Jane");

        System.out.println("Is stack empty? - "+ stk.empty());

        //removes top element from stack
        stk.pop();

        System.out.println("Stack -"+ stk);

        //returns top element of stack without removing it from stack
        System.out.println("Top of stack - "+ stk.peek());

        //returns size of stack
        System.out.println("Stack size - "+ stk.size());

        //returns position of element in stack from top. starting with index=1
        //if element not found, returns -1
        System.out.println("Position of Lucy in stack - "+ stk.search("Lucy"));
    }
}
