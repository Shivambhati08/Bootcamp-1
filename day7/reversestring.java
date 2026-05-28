

public class reversestring {
    public static void main(String[] args) {
        String str = "shivam";
        char ch[] = str.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
    
}
