package dsa;//import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args)
    {
        int[] arr = {0,3,6,8,10,12,20,34,45,55};

        int target = 20;

        //using inbuilt function. This function provides the indx value of the target.
        //If target is not present in the array then it provides the possible insertion index: -(insertion index)-1
        //if target is 11 then it needs to be between 10,12 so -(5)-1= -6

        //int indx= Arrays.dsa.binarySearch(arr,target);

        //Iterative approach
        int indx= binarySearch(arr, target);

        System.out.println("Indx :" + indx + " target :"+target);

        if(indx <0)
            System.out.println("Not found");
        else
            System.out.println("Found");

        //Recursive approach
        int idx= recBinarySearch(arr, target,0, arr.length-1);

        System.out.println("Idx :" + idx + " target :"+target);

        if(indx <0)
            System.out.println("Not found");
        else
            System.out.println("Found");

    }

    public static int binarySearch(int[] arr, int target)
    {
        //Iterative approach
        int start=0;
        int end = arr.length-1;

        while(start <= end)
        {
            int mid = start + (end-start)/2; //this takes care of int value limit overflow

            if(target > arr[mid])
                start = mid+1;
            else if(target < arr[mid])
                end = mid-1;
            else
                return mid;

        }
        return -1;

    }

    public static int recBinarySearch(int[] arr, int target, int start, int end)
    {
        if(start < end)
        {
            int mid = start + (end-start/2);

            if(target > arr[mid])
                return recBinarySearch(arr,target, mid+1, end);  //check right of mid
            else if(target < arr[mid])
                return recBinarySearch(arr,target, start, mid-1); //check left of mid
            else
                return mid; //found

        }
        return -1;
    }
}
