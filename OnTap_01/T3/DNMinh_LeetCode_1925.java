package vn.techmaster;

public class evenNOD {
    public int findNumbers(int[] nums) {
        int count = 0;
        // Rất sáng tạo! => 10 điểm về chỗ!
        for(int i:nums){
            if(String.valueOf(i).length() % 2 == 0)
                count++;
        }
        return count;
    }
}
