public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "java interview prep";
        String result = str.replaceAll("\\s", "");
        System.out.println("Without whitespace: " + result);
    }
}
