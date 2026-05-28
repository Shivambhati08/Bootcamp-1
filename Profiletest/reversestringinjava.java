public class reversestringinjava {
    public static void main(String[] args) {
        String st = "shivam thakur";
        int left = 0;
        int right = st.length()-1;
        while(left < right){
            char temp = st.charAt(left);
            st.charAt(left) = st.charAt(right);
            st.charAt(right) = temp;
        }
    }
}
