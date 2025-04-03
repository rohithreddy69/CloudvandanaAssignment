import java.util.Arrays;

public class AnagramQuestion {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "sileng";

        if (s1.length() != s2.length()) {
            System.out.println("not a anagaram");
            return;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean areAnagrams = Arrays.equals(charArray1, charArray2);
        System.out.println(areAnagrams);
    }
}