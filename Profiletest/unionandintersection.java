public class unionandintersection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int brr[] = {2,3,4,5,6,9};
        int i = 0, j = 0;
        System.out.println("Union ");
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                System.out.print(arr[i]+" ");
                i++;
            }
            else if(arr[i] > brr[j]){
                System.out.print(brr[j]+" ");
                j++;
            }
            else {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
        while(i < arr.length){
            System.out.print(arr[i]+" ");
            i++;
        }
        while(j < brr.length){
            System.out.print(brr[j]+" ");
            j++;
        }
        System.out.println();
        System.out.println("Intersection ");
        i = 0; 
        j = 0;
        while(i < arr.length && j < brr.length){
            if(arr[i] < brr[j]){
                i++;
            }
            else if(arr[i] > brr[i]){
                j++;
            }
            else {
                System.out.print(arr[i]+" ");
                i++;
                j++;
            }
        }
    }
}
