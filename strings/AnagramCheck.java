import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String first = "listen", second = "silent";
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(first + " and " + second + (Arrays.equals(a, b) ? " are anagrams" : " are not anagrams"));
    }
}
