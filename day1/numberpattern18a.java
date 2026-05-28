public class numberpattern18a {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];

        int top = 0, bottom = 9- 1;
        int left = 0, right = 9 - 1;

        int ele = 5;

        // ONE while loop
        while (ele >= 1) {

            // for loop 1 → top row
            for (int j = left; j <= right; j++) {
                arr[top][j] = ele;
            }

            // for loop 2 → right column
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = ele;
            }

            // for loop 3 → bottom row
            for (int j = left; j <= right; j++) {
                arr[bottom][j] = ele;
            }

            // for loop 4 → left column
            for (int i = top; i <= bottom; i++) {
                arr[i][left] = ele;
            }

            top++;
            bottom--;
            left++;
            right--;
            ele--;
        }

        // printing the array
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}