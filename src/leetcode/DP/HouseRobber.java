package leetcode.DP;

import java.util.Arrays;

public class HouseRobber {

    public static void main(String args[])
    {
        int[] nums = {1, 2, 3, 1};

        System.out.println(houseRobber(nums));
    }

    public static int houseRobber(int[] nums) {

        //TC - O(n)
        //SC - O(n)

        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int amount[] = new int[nums.length];
        amount[0] = nums[0];
        amount[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<nums.length; i++)
        {
            amount[i] = Math.max(amount[i-1], nums[i] + amount[i-2]);
        }

        return amount[nums.length -1];

    }
}
