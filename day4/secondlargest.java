public class secondlargest{
    public static void main(String[] args) {
        int arr[] = {6,6,6,6,5,6,6};
        int max = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                seclar = temp;
            }
            if(arr[i] > seclar && arr[i] < max){
                seclar = arr[i];
            }
        }
        if(seclar != Integer.MIN_VALUE)
        System.out.println("Second largest element = "+seclar);
        else 
            System.out.println("Second largest does not exist");
    }
}