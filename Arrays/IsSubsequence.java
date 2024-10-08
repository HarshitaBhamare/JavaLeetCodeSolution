public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int sp = 0;
        int tp = 0;
        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                System.out.println(s.charAt(sp) + " " + t.charAt(tp));
                sp++;
            }
            tp++;
        }
        return sp == s.length();
    }
}
