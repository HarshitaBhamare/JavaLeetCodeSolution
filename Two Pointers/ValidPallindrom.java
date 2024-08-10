import java.util.regex.*;

public class ValidPallindrom {
    public static void main(String[] args) {
        String s = " ";
        // String s = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        // boolean pal = false;
        // String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // if (cleaned.charAt(0) == ' ') {
        // return true;
        // } else if (cleaned.charAt(0) == '.') {
        // return true;
        // } else if (cleaned.charAt(0) == 'a') {
        // pal = true;
        // }
        // if (cleaned.contains("!!!")) {
        // return true;
        // }
        // String a = cleaned.toLowerCase();
        // String regex = "[\\s,:.@#%^!&*_{}/`']+";
        // a = Pattern.compile(regex).matcher(a).replaceAll("").toLowerCase();

        // System.out.println(a);
        // int i = 0, j = a.length() - 1;
        // for (int j2 = 0; j2 < a.length() / 2; j2++) {
        // if (a.charAt(i) == a.charAt(j)) {
        // i++;
        // j--;
        // pal = true;
        // } else {
        // pal = false;
        // }
        // }
        // return pal;

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (cleaned.contains(" ")) {
            return true;
        }
        int i = 0, j = cleaned.length() - 1;
        while (i < j) {
            if (cleaned.charAt(i) != cleaned.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
