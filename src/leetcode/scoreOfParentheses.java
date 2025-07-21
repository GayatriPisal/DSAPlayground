package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class scoreOfParentheses {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balanced input string:");

        String input = scanner.next();

        System.out.println(scoreOfParentheses(input));
    }

    public static int scoreOfParentheses(String s) {

        int score=0;
        Stack<Integer> stk = new Stack<>();

        for(Character c : s.toCharArray())
        {
            if(c=='(')
            {
                stk.push(score);
                score=0;
            }
            else if(c==')')
            {
                score = stk.pop() + Math.max(score*2, 1);
            }

        }
        return score;
    }


}


