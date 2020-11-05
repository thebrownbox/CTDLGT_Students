public class Quang_1299 {

    public static int[] replaceElements(int[] arr){
        int[] newArr = new int[arr.length];
        if(arr.length==1)
            newArr[0] = arr[0];
        else{
            for(int i=0;i<arr.length-1;i++){
                int max = Integer.MIN_VALUE;
                for(int j=i+1;j<arr.length;j++)
                    if (arr[j] > max)
                        max = arr[j];
                newArr[i] = max;
            }
        }
        newArr[arr.length-1] = -1;
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        int[] arr = replaceElements(nums);
        for(int e:arr)
            System.out.print(e + " ");
    }
}
