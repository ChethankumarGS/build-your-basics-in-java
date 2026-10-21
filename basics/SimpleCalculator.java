public class SimpleCalculator {
    public static void main(String[] args) {
        double a = 12, b = 4;
        char operator = '*';
        double result;
        switch (operator) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
