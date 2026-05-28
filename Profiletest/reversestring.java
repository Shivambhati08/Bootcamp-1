public class reversestring{
    public static String reverse(String str){
        if(str.length() == 0)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String str1 = "Shivam Thakur";
        System.out.println(reverse(str1));
    }
}