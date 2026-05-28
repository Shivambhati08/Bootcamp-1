
public class hashingbyarray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 1, 4};
        int n = arr.length;
        int[] brr = new int[11];
        for (int i = 0; i < n; i++) {
            brr[arr[i]]++;
        }
        for (int a : brr) {
            System.out.print(a + " ");
        }
        int max = brr[0], i = 0, index = 0;
        for (i = 0; i < 11; i++) {
            if (max < brr[i]) {
                max = brr[i];
                index = i;
            }
        }
        System.out.println("\n"+index+ " "+max);
    }
}
