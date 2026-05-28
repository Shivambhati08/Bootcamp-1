public class pairs {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,3,24,54,34};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == 8){
                System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}
