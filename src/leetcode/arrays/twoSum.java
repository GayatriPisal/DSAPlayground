package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static void main(String args[])
    {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println((Arrays.toString(twoSumm(nums, target))));

        //Time and Space Complexity: O(n)
    }

    private static int[] twoSumm(int[] nums, int target) {

        if(nums.length == 0)
            return new int[]{};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];
            if(map.containsKey(diff))
                return(new int[]{map.get(diff),i});
            else
                map.put(nums[i],i);
        }

        return new int[]{};
    }

}
