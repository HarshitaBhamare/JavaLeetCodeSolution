public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int l = 0, r = s.length - 1;
        // char temp = 0;
        while (l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;

        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
