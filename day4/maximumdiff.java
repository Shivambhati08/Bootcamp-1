public class maximumdiff{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,4,8,9};
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n ; i++){
           if(max < arr[i])
            max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        System.out.println(max - min);
    }
}