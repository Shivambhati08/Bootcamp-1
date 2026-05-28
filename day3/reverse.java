public class reverse{
    public static void revstr(String s, int i){
        if(i == s.length()) return;
        revstr(s, i+1);
        System.out.print(s.charAt(i));
    }
    public static void main(String[] args) {
        String str = "shivam thakur";
        revstr(str, 0);
    }
}