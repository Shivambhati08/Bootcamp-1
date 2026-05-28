public class equilibriumpoint {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,2};
        int totalsum = 0;
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalsum -= arr[i];
            if(totalsum == leftsum){
                System.out.println("Equilibrium point is = "+i);
                return;
            }
            leftsum += arr[i];
        }
        System.out.println("Equilibrium point is not found");
    }
}
