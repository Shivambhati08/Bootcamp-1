public class findleadersinarray{
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int max = arr[i];
            int flag = 1;
            for(int j = i+1; j < n; j++){
                if(arr[j] > max){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.print(arr[i]+" ");
        }
    }

}