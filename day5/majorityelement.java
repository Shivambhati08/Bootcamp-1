public class majorityelement {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,2,4,3,2,2,2,2};
        int n = arr.length;
        int count = 1;
        int majorityele = arr[0];
        for (int i = 1; i < n; i++) {
                if(arr[i] == majorityele){
                     count++;
                }
                else{
                    count--;
                }
                if(count == 0){
                    majorityele = arr[i];
                    count = 1;
                }
            }
            count = 0;
            for (int i = 0; i <n; i++) {
                if(arr[i] == majorityele){
                    count++;
                }
            }
        if(count > n/2){
            System.out.println("Majority element = "+majorityele);
        }
        else{
            System.out.println("No major element exist");
        }
    }
}
