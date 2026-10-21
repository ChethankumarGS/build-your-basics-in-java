public class StringLengthWithoutBuiltin {
    public static void main(String[] args) {
        String str = "interview";
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of \"" + str + "\" is " + length);
    }
}
