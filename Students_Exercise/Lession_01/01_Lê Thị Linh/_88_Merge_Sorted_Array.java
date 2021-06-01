/**
 * _88_Merge_Sorted_Array
 */
public class _88_Merge_Sorted_Array {

    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
        while (i<arr1.length & j <arr2.length)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
     
        // Store remaining elements of first array
        while (i < arr1.length)
            arr3[k++] = arr1[i++];
     
        // Store remaining elements of second array
        while (j < arr2.length)
            arr3[k++] = arr2[j++];
    }
     
    public static void main (String[] args)
    {
        int[] arr1 = {1, 3, 5, 7};
        int n1 = arr1.length;
     
        int[] arr2 = {2, 4, 6, 8};
        int n2 = arr2.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(arr1, arr2, arr3);
     
        System.out.println("Array after merging: ");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
}
    
