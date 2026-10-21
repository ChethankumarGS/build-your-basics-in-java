public class SimpleLoginSystem {
    public static void main(String[] args) {
        String savedUsername = "chethan";
        String savedPassword = "pass123";

        String enteredUsername = "chethan";
        String enteredPassword = "pass123";

        if (savedUsername.equals(enteredUsername) && savedPassword.equals(enteredPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
