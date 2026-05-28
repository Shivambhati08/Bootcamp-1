public class majority{
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,1,1,2,3,4,5,6,2,2,2,2};
        int n = arr.length;
        int count = 1;
        int candidate = arr[0];                // Moore’s Voting Algorithm (O(n))
        for(int i = 1; i < n; i++){
            if(arr[i] == candidate){
                count++;
            }
            else count--;
            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
       if(count > n/2){
        System.out.println("Majority element = "+candidate);
       }
       else {
        System.out.println("No majority element exist");
       }
    }
}