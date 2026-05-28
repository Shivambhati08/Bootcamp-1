public class printpair{
    public static void main(String[] args) {
        int arr[] = {10,20,5,13,11};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
    }
}