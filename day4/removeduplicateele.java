public class removeduplicateele {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,3,4,5,4,3,2,4,3,5,6,7};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    for (int j2 = j; j2 < n-1; j2++) {
                        arr[j2] = arr[j2+1]; 
                    }
                    n--;
                    j--;
                }
            }
        }
        System.out.println("Distinct elements are: "+n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
