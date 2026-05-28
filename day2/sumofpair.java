public class sumofpair{
    public static void main(String[] args) {
        int arr[] = {10,20,5,13,11};
        int target[] = {8,10,25,33};
        for(int t = 0; t < target.length; t++){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == target[t])
                System.out.println(target[t]+" = "+arr[i]+"," +arr[j]);
            }
        }
        }
    }
}