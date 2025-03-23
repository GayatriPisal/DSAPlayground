package dsa;

public class quickSort {

    public static void main (String args[])
    {
        int arr[] = {10,16,8,12,15,6,3,9,5};

        quickSort(arr, 0, arr.length-1);
        System.out.println("sorted arr: ");
        for(int i=0; i< arr.length; i++)
            System.out.print(arr[i]+" , ");

    }

    public static void quickSort(int[] arr, int start, int end)
    {
        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot+1, end);
        }
    }

    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int pIndex= start; //partition index

        for(int i= start; i < end; i++)
        {
            if(arr[i] <= pivot)
            {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    private static void swap(int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
