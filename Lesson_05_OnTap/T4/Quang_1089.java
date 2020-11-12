import java.util.ArrayList;

public class Quang_1089 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        for(int e:arr)
            System.out.print(e + " ");
    }

    public static void duplicateZeros(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                list.add(arr[i]);
                list.add(arr[i]);
            }
            else
                list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
    }
}
