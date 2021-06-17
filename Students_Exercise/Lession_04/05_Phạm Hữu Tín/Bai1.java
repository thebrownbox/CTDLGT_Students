public class Bai1 {
    public static int find(int x, int [] a ){
        int n = a.length; 
        for( int i = 0; i < n; i++) 
        { 
            if(a[i] == x) 
                return i; 
        } 
        return -1; 
    }
    public static void main(String[] args) {
       
        int [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = find(5, a); 
    if(result == -1) 
        System.out.print("phần tử k tìm thấy"); 
    else
        System.out.print("từ vị trí số 0 ta tìm đc phần tử ợ vị trí " + result + "   "); 
    }
}
