package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateParanthesis {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of n :");

        int n = scanner.nextInt();

        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {

        List<String> res= new ArrayList<>();
        recursiveFunctn(res,0,0,"",n);
        return res;
    }

    public static void recursiveFunctn(List<String> res, int openP, int closeP, String s, int n)
    {
        if(openP + closeP == n*2) //if(s.length() == n*2)
        {
            res.add(s);
            return;
        }

        if(openP < n)
        {
            recursiveFunctn(res, openP+1, closeP, s+"(", n);
        }

        if(closeP < openP)
        {
            recursiveFunctn(res, openP, closeP+1, s+")", n);
        }
    }
}


