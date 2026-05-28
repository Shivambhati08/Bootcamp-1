public class spiralmatrix1{
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        int num = 1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = num++;
            }
        }
        int top = 0, bottom = 3;
        int left = 0, right = 4;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
    }
}