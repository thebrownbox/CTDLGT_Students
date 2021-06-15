import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai3 {
    public int calSeparate(int n){
        int result = 0;
        while (n > 0){
            int check = n % 10;
            result += Math.pow(check, 2);
            n = n /10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> SetNums = new HashSet<>();
        while (!SetNums.contains(n))
        {
            SetNums.add(n);
            n = calSeparate(n);
        }
        return n== 1;
    }
}
