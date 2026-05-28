public class commoneleinthreesortedarray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int brr[] = {2,4,5,6,8,9,10};
        int crr[] = {1,2,4,5,7,9,11};
        int i = 0, j = 0, k = 0;
        while(i < arr.length && j < brr.length && k < crr.length){
            if(arr[i]  == brr[j] &&  arr[i] == crr[k]){
                System.out.print(arr[i]+" ");
                i++;
                j++;
                k++;
            }
            else if(arr[i] < brr[j]){
                i++;
            }
            else if(brr[j] < crr[k]){
                j++;
            }
            else k++;
        }
    }
}
