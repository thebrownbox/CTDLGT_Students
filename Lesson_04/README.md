# Bài tập | (Chi cần nộp file *.java)
## Đệ quy 

Mọi người up file source code (\*.java) lên với format như sau: Ten_LeetCode_LeetCodeID <br/>
"Cong_LeetCode_26.java" <br/>
"Cong_LeetCode_88.java" <br/>
"Cong_LeetCode_283.java" <br/>

### Bài 1: Tìm kiếm tuần tự sử dụng đệ quy.
<pre>
find	Hàm find có chức năng tìm biến x trong mảng a và trả về index của x trong mảng a.
x	số cần tìm
a	mảng đang tìm kiếm
i	-tùy chọn- (bạn tự định nghĩa, có thể dùng hoặc ko dùng)
return	- Nếu x tồn tại trong a thì return về index.
- Nếu không tồn tại return -1.
public class SimpleRecursion {

    public static int find(int x, int[] a, int i)
    {
         // #1 your implementation
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // #2 Call function find
    }
}
</pre>

### Bài 2: Tính tổng sử dụng đệ quy
<pre>
sum1	Implement hàm sum1 để tính tổng các phần tử có trong mảng a
a	mảng cần tính tổng
i	-tùy chọn- (bạn tự định nghĩa, có thể dùng hoặc ko dùng)
return	Tổng cần tìm
public static int sum1(int[] a, int i)
{
    // #1 your implementation
}

public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // #2 call function sum1
}
</pre>

### Bài 3: Tính tổng từ a đến b bằng đệ quy
<pre>
sum2	 
a	mảng cần tính tổng
startIndex	chỉ số bắt đầu
endIndex	chỉ số kết thúc
return	Tổng cần tìm
public static int sum2(int[] a, int startIndex, int endIndex)
{
    // #1 Your implementation
}

public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // #2 call sum2
}
</pre>