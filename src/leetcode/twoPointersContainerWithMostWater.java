package leetcode;

import java.util.Arrays;

public class twoPointersContainerWithMostWater {

    public static void main(String args[])
    {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int maxWater = maxWater(height);

        System.out.println("Max water: "+maxWater);
    }

    public static int maxWater(int[] height)
    {
        if(height == null || height.length==0)
            return 0; //height array is empty so no water to hold

        //start from beginning and end of array
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right)
        {
            //calculate the area of water for each left anf right height options
            int minHeight = Math.min(height[left], height[right]);  //consider min height as above this height the water will overflow
            int width = right - left;

            //area = height * width
            int area = minHeight * width;

            maxArea = Math.max(area, maxArea);   //update maxArea only if we get area which is larger than maxArea

            if(height[left] < height[right]) //move the pointer of lower value
                left++;
            else
                right--;
        }

        return maxArea;
    }
}


