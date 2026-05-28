public class sortedarray {
    public static void main(String[] args) {
        int arr[] = {9,8,6,4,5,2,1};
        boolean ascending = true, desceding = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]){
                ascending = false;
            }
            if(arr[i-1] < arr[i]){
                desceding = false;
            }
        }
        if(ascending){
            System.out.println("Array is sorted in ascending order.");
        }
        else if(desceding){
            System.out.println("Array is sorted in descending order.");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
