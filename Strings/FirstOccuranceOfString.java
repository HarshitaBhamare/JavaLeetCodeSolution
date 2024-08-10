package Strings;

public class FirstOccuranceOfString {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "xd";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        // System.out.println(haystack.contains(needle));
        // if (haystack.contains(needle)) {
        // return 0;
        // }
        // return -1;
        if (needle.isEmpty()) {
            return 0;
        }

        return haystack.indexOf(needle);
    }
}
