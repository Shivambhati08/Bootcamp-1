public class sortingonezeroandtwo {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,2,0,0,2,2,1,0,0};
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid <= high){
            if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else {
                int temp = arr[high];
                 arr[high] =  arr[mid];
                 arr[mid] = temp;
                 high--;
             }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}

