package leetcode;

import java.util.Stack;

public class stringDecode {

    //Arrays and Stack
    public static void main(String args[])
    {
        String s= "3[a]2[bc]";

        System.out.println(decodeStr(s));
    }

    public static String decodeStr(String s)
    {
        Stack<Integer> numStk = new Stack<>();
        Stack<StringBuilder> strStk = new Stack<>();
        StringBuilder currentStr = new StringBuilder();
        int k=0;

        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                k = k*10 + c-'0';
            }
            else if(c == '[')
            {
                numStk.push(k);
                strStk.push(currentStr);
                k=0;
                currentStr = new StringBuilder();
            }
            else if(c == ']')
            {
                StringBuilder decodeStr = strStk.pop();
                int currK = numStk.pop();

                while(currK > 0)
                {
                    decodeStr = decodeStr.append(currentStr);
                    currK--;
                }
                currentStr = decodeStr;
            }
            else{
                currentStr.append(c);
            }
        }
        return currentStr.toString();

    }
}
