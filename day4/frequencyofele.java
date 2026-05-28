public class frequencyofele{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,1,4,6,7,3,8,9,0,3};
        int n = arr.length;
        boolean visited[] = new boolean[n];

        for(int i = 0; i < n; i++){
            if(visited[i])
                continue;
            int count = 1;
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Frequency of "+arr[i]+ " = "+count);
        }
    }
}