package Lesson04_Recursion;

class QuickSort {
    void quickSort(int[] a, int L, int R)
    {
        if(L >= R) return;
        int k = partition(a, L, R);
        quickSort(a, L, k);
        quickSort(a, k+1, R);
    }

    int partition(int[] a, int L, int R)
    {
        int key = a[L];
        int iL = L;
        int iR = R;
        while (iL < iR)
        {
            while (a[iL] < key && iL < R) iL++;
            while (a[iR] >= key && iR > L) iR--;
            if(iL < iR)
            {
                int t = a[iL];
                a[iL] = a[iR];
                a[iR] = t;
            }
        }
        return iR;
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }
}