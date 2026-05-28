public class mergesort{
    public static void dividehelp(int arr[], int left, int right){
          if(left == right){
            for(int i = left; i <= right; i++){
                System.out.print(arr[i]+"\t");
        }
    }
        if(left < right){
            for(int i = left; i <= right; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            int mid = (left + right)/2;
            dividehelp(arr, left, mid);
            dividehelp(arr, mid+1, right);
        }
       
}
    public static void main(String[] args) {
        int arr[] = {2,8,6,3,4,1,7};
        int left = 0;
        int right = arr.length - 1;
        dividehelp(arr, left, right);
    }
}