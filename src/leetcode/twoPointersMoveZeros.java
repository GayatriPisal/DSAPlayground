package leetcode;

import java.util.Arrays;

public class twoPointersMoveZeros {

    public static void main(String args[])
    {
        int[] nums = {0,1,0,3,12};

        moveZeros(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros(int[] nums)
    {
        if(nums == null || nums.length==0)
            return;

        int left = 0;
        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right]!=0)
            {
                //swap values at left and right position
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                //increment left pointer
                left++;
            }
        }

    }
}
