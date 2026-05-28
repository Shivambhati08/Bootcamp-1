public class spiralmatrix{
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        int num = 1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = num++;
            }
        }
        int top = 0, down = 3;
        int left = 0, right = 4;
        while(top <= down && left <= right){
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i = top; i <= down; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top <= down){
            for(int i = right; i >= left; i--){
                System.out.print(arr[down][i]+" ");
            }
            down--;
        }
            if(left <= right){
            for(int i = down; i >= top; i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
        }
        }
    }
}