package leetcode;

import java.util.HashSet;

public class longestSubStringWithoutRepeatChar {

    public static void main(String args[])
    {
        String s= "abcabcbb";

        System.out.println(longestSubStringWithoutRepeatChar(s));
    }

    public static int longestSubStringWithoutRepeatChar(String s)
    {
        if(s.length() <2)
            return s.length();

        HashSet<Character> charSet = new HashSet<>();

        int max=0;
        int right =0;
        int left=0;

        while(right < s.length())
        {
            while(charSet.contains(s.charAt(right)))
            {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            right++;

            max= Math.max(max, (right-left));
        }
        return max;
    }
}
