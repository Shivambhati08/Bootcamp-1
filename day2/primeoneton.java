import java.util.Scanner;
public static void primenum(int n){
    int flag = 1;
    if(n <= 1){
         return;
    }
    else {
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                flag = 0;
            }
        }
        if(flag == 1)
            System.out.print(n+" ");
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("input a number: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        primenum(i);
    }
}