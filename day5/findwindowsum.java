public class findwindowsum{
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,2,1,8,4};
        int targetsum = 18;
        int currsum = 0; 
        int  start = 0;
        for(int end = 0; end < arr.length; end++){
            currsum += arr[end];
            while(currsum > targetsum && start  <= end){
                currsum -= arr[start];
                start++;
            }
            if(currsum == targetsum){
                    System.out.print("subarray found from index "+start+"lasses"});

            }
            }
        }
    }
}