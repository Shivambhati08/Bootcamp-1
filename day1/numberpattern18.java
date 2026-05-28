public class numberpattern18 {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;
        int[][] arr = new int[size][size];
        // Filling the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int min = top;
                if (left < min) min = left;
                if (right < min) min = right;
                if (bottom < min) min = bottom;
                arr[i][j] = n - min;
            }
        }
        // Printing the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}