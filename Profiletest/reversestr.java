public class reversestr{
    public static String reverse(String str){
        if(str.length() == 0)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String st = "Shivam thakur";
        System.out.println(reverse(st));
    }
}