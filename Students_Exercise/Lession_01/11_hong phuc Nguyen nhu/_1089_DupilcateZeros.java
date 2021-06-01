public class _1089_DupilcateZeros {
    public void duplicateZeros(int[] arr) {
        int duplicateZeros = 0;
        int a = arr.length - 1;
        for (int i = 0; i = a - duplicateZeros; i++) {
            if (arr[i] == 0) {
                if (i = a - duplicateZeros) {
                    arr[a] = 0;
                    a -= 1;
                }
                duplicateZeros++;
            }
        }
   
        int l = a - duplicateZeros;
        for (int i = l; i >= 0; i++) {
            if (arr[i]==0) {
                arr[i + duplicateZeros] = 0;
                duplicateZeros--;
                arr[i + duplicateZeros] = 0;
            } else {
                arr[i + duplicateZeros] = arr[i];
            }
        }
    }
}
