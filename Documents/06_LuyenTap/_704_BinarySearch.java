public class _704_BinarySearch {
    public static int find(int x, int[] a, int L, int R){
        if(L > R) return -1;
        
        int mid_index = (L+R) /2;
        int key = a[mid_index];
        if(key == x) return mid_index;

        if(x > key){// x nam o ben phai
            return find(x, a, mid_index+1, R);
        }else{ // x num o ben trai
            return find(x, a, L, mid_index-1);
        }
    }

 
    public int search(int[] nums, int target) {
        int n = 10;
        int[] a = new int[n]; //n
        // o(n) = n
        // Tim
        // log(n) | n

        return find(target, nums, 0, nums.length-1);
    }
}
