import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are Anagrams? " + isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
