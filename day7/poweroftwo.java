
public class poweroftwo {
    public static void main(String[] args) {
        int n = 512;
       
        if(n > 0 && (n & (n-1)) == 0){
            System.out.println("Number is power of two");
        }
        else
        {
            System.out.println("Number is not a power of two");
        }
    }
    
}
