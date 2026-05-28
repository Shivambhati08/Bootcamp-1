public class dessstar{
    public static void main(String[] args) {
        for(int i = 1; i <=5; i++){
            for(int j = 1; j <=5-i; j++){
                System.out.print("_ ");
            }
            System.out.print("*\n");
        }
    }
}