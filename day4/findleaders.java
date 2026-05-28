public class findleaders{
    public static void main(String[] args) {
        int arr[] = {9,5,2,3,4,6,2,1};
        int n = arr.length;
        int leader = arr[n-1];
        System.out.print(leader+" ");
        for(int i = n-2; i >= 0; i--){
           if(arr[i] > leader){
            leader = arr[i];
        System.out.print(leader+" ");
           }
        }
    }
}