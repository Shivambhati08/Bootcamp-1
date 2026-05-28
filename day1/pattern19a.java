public class pattern19a{
    public static void main(String[] args) {
        int n = 3; 
        int space = 0;
        for(int t = 1; t <= n; t++){

            for(int i = 1; i <= n; i++){
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
                }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
                }
            System.out.println();
          
            }
        space += n;
        }
    }
}