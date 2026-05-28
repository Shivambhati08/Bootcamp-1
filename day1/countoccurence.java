public class countoccurence{
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,1,4};
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int ele = arr[i];
            int count = 0;
            for(int j = 0; j < n; j++){
                if(ele == arr[j])
                    count++;
            }
            System.out.println(ele+" = "+count);
        }
    }
}