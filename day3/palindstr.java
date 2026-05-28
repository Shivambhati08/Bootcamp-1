public class palindstr{
    static boolean palind(String s, int start, int last){
            if(start >= last)
                return true;
            if(s.charAt(start) != s.charAt(last))
                return false;
            return palind(s, start+1, last-1);
    }
    public static void main(String[] args) {
        String s = "naman";
        if(palind(s, 0, s.length()-1))
            System.out.println("palindrome");
        else
            System.out.println("Not a palindrome");
    }
}