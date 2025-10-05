package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class evaluateReversePolishNotion {

    public static void main(String args[])
    {
        String[] s = {"2","1","+","3","*"};

        evalRPN(s);

        System.out.println(evalRPN(s));
    }

    public static int evalRPN(String[] tokens)
    {
        Stack<Integer> stk = new Stack<>();

        for(String c : tokens)
        {
            if(c.equals("+"))
            {
                stk.push(stk.pop()+stk.pop());
            }
            else if(c.equals("*"))
            {
                stk.push(stk.pop()* stk.pop());
            }
            else if(c.equals("-"))
            {
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1-num2);
            }
            else if(c.equals("/"))
            {
                int num2 = stk.pop();
                int num1 = stk.pop();
                stk.push(num1 / num2);
            }
            else
                stk.push(Integer.parseInt(c));
        }

        return stk.peek();

    }
}
