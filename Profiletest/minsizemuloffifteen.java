public class minsizemuloffifteen{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 10;

        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("No subarray found");
        else
            System.out.println("Minimum size = " + minLen);
    }
}