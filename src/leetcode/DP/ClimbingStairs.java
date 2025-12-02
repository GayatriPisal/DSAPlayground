package leetcode.DP;

public class ClimbingStairs {

    public static void main(String args[])
    {
        int n = 5;

        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        //TC= O(n)  SC=O(n)
       /* if(n<=3)
         return n;

        int dp[] =new int[n];
         dp[0] =1;
         dp[1] =1;
         dp[2] =2;

        for(int i=3; i<=dp.length+1; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n]; */

        //TC=O(n) SC=O(1)
        if(n<=3)
            return n;

        int prev =1;
        int secPrev =1;
        int curr = 0;

        for(int i=2; i<= n+1; i++)
        {
            int temp;
            curr = prev + secPrev;
            temp = curr;
            prev = curr;
            secPrev=prev;
        }
        return curr;
    }
}
