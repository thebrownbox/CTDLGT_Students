public class _344_Reverse_String {
public static void swap(char[] arr, int i, int j) {
    if(i < j){
        char t = arr[i];
        arr[i] = arr[t];
        arr[j] = t;
        swap(arr, i+1, j-1);
    }    
}

    public void reverseString(char[] s) {
        swap(s,  0, s.length-1);
        
    }

    public static void main(String[] args) {
        
    }
    
}
