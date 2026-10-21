public class EmptyStringCheck {
    public static void main(String[] args) {
        String str = "";
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}
