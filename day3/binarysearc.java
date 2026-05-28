public class binarysearc{
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int left = 0; 
        int right = arr.length-1;
        int flag = 0;
        int ele = 7;
        int mid = 0;
        while(left <= right){
           mid = (left + right)/2;
        if(ele == arr[mid]){
            flag = 1;
            break;
        }
        else if(ele > arr[mid]){
            left = mid + 1;
        }
        else if(ele < arr[mid]){
            right = mid - 1;
        }
    }
    if(flag == 1){
        System.out.println("Element fount at index "+mid);
    }
    else
            System.out.println("Element not found");
    }
}