class Solution {

  public boolean checkIfExist(int[] arr) {
    boolean result = false;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0 && arr[i + 1] == 0) {
        result = true;
        break;
      }
      for (int j = 0; j < arr.length; j++) {
        // 1. Không nên ép kiểu ntn
        // 2. Cũng ko nhất thiết phải chạy từ 0
        if ((double) arr[i] / (double) arr[j] == 2) {
          result = true;
          break;
        }
      }
    }
    return result;
  }
}
