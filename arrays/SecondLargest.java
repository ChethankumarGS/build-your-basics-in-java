public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 23};
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        System.out.println("Second largest element is " + second);
    }
}
