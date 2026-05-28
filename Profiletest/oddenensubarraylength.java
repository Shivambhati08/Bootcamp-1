public class oddenensubarraylength {
    public static void main(String[] args) {
        int arr[] = {10,2,3,4,5,6,12,13,15};
        int length = 1;
        int maxlength = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] % 2 == 0 && arr[i-1] % 2 != 0 || arr[i] % 2 != 0 && arr[i-1] % 2 == 0){
                length++;
                maxlength = Math.max(length, maxlength);
            }
            else{
                length = 1;
            }
        }
        System.out.println("Maximum length = "+maxlength);
    }
}
