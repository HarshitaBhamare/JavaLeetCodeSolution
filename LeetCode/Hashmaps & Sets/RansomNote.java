import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "baab";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        // a - 2 b - 1 new hash b - 0
        for (char c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                if (map.get(c) <= 0) {
                    return false;
                }
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
    // 26 0 - A 3 1 - b
}
