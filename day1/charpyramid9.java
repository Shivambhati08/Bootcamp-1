public class charpyramid9{
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(" ");
            }
            int l = 1;
            for(int k = 1; k <= 2*i-1; k++){
                if(k<i){
                    System.out.print((char)(l+64));
                    l++;
                }
                else {
                    System.out.print((char)(l+64));
                    l--;
                }
            }
            System.out.println();
        }
    }
}