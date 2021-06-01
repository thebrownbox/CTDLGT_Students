public class _88_MergeSortedArray {

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int ai : nums2) {
      chenPhanTuVaoMang(ai, nums1, m);
      m++;
    }
  }

  private static void chenPhanTuVaoMang(int x, int[] a, int m) {
    boolean timDuocK = false;
    for (int k = 0; k < m; k++) {
      if (a[k] > x) {
        timDuocK = true;

        for (int i = m - 1; i >= k; i--) {
          a[i + 1] = a[i];
        }
        a[k] = x;

        break;
      }
    }

    if (timDuocK == false) {
      a[m] = x;
    }
  }

  public static void main(String[] args) {
    int[] n1 = {2,3,4,5,0,0,0};
    int[] n2 = { 0,3,6 };

    merge(n1, 4, n2, 3);
    System.out.println("DONE");
  }
}
