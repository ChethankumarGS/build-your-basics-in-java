public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 25;
        StringBuilder binary = new StringBuilder();
        int temp = num;
        while (temp > 0) {
            binary.insert(0, temp % 2);
            temp /= 2;
        }
        System.out.println("Binary of " + num + " is " + binary);
    }
}
