public class findleadersinanarray {
    public static void main(String[] args) {
        int arr[] = {6,7,3,4,1,5,2};
        int n = arr.length;
        int leader = arr[n-1];
        System.out.print(leader+" ");
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] > leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }
    }
}
