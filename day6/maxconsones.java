public class maxconsones{
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,1,1,0,1,0,1,1,1,1,0,1};
        int n = arr.length;
       int count = 0;
        int maxlength = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count++;
            if(maxlength < count ){
                maxlength = count;
                }
            }
            else count = 0;
        }
        System.out.println("Maximum one = "+maxlength);
    }
}