public class frequencycountofsortedarray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,3,4,4,5,5,5,6,6,6,6,6};
        int n = arr.length;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
            System.out.println(arr[i-1]+ " = "+count);
            count = 1;
            }
        }
        System.out.println(arr[n-1]+" = "+count);
    }
}
