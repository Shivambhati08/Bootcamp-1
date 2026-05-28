public class pattern18{
    public static void main(String[] args) {
        int n = 5;
        int size = 2*n-1;
        int arr[][] = new int[size][size];
        int top = 0, bottom = size - 1;
        int left = 0, right = size-1;
        int value = n;
        while(value>=1){
            for(int j = left; j <= right; j++)
                arr[top][j] = value;
            for(int i = top; i <= bottom ; i++)
                arr[i][right] = value;
            for(int j = left; j <= right; j++)
                arr[bottom][j] = value;
            for(int i = top ; i <= bottom; i++)
                arr[i][left] = value; 
            top++;
            bottom--;
            left++;
            right--;
            value--;
        }
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    } 
}