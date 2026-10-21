public class StringContainsSubstring {
    public static void main(String[] args) {
        String str = "software engineering";
        String sub = "engineer";
        System.out.println(str + (str.contains(sub) ? " contains " : " does not contain ") + sub);
    }
}
