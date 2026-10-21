public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println(num + " has " + count + " digits");
    }
}
