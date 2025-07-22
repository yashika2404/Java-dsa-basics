public class CountVowels {
    public static void main(String[] args) {
        String str = "Beautiful";
        System.out.println("Vowel Count: " + countVowels(str));
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }
}
