public class butterfly{
    public static void main(String[] args) {
        for(int i = 0; i <=6; i++){
            for(int j = 0; j <=6; j++){
                if(i==j && (i+j)%2==0){
                System.out.print("*");
                }
                // else if(i>=j && (i+j)>=6){
                //     System.out.print("*");
                // }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}