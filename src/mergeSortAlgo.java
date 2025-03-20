public class mergeSortAlgo {

    public static void main(String[] args)
    {
        int arr[] = {10,16,8,12,15,6,3,9,5};

        System.out.println("Array : ");
        for(int n : arr)
            System.out.print(n + " ");

        mergeSort(arr, 0, arr.length-1);

        System.out.println("\nSorted Array : ");
        for(int n : arr)
            System.out.print(n + " ");

    }

    public static void mergeSort(int[] arr, int start, int end)
    {
        if(start < end)
        {
            int mid = (start+end)/2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr,start,mid,end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid-start+1;
        int n2= end-mid;

        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for(int i= 0; i < n1; i++ )
            lArr[i] = arr[start + i];

        for(int i= 0; i < n2; i++)
            rArr[i] = arr[mid+1+i];

        int i=0;  //pointers for left, right and main array
        int j=0;
        int k=start;

        while(i < n1 && j < n2)
        {
            if(lArr[i] <= rArr[j])
            {
                arr[k] = lArr[i];
                i++;
            }
            else{
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        //if any array is done then check if another array has elements that can be copied to main array as it is
        while(i < n1)
        {
            arr[k]=lArr[i];
            i++;
            k++;
        }

        while(j < n2)
        {
            arr[k]= rArr[j];
            j++;
            k++;
        }

    }
}
