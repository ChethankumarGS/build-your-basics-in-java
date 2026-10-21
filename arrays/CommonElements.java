public class CommonElements {
    public static void main(String[] args) {
        int[] first = {1, 3, 5, 7, 9};
        int[] second = {2, 3, 6, 7, 10};
        System.out.print("Common elements: ");
        for (int a : first) {
            for (int b : second) {
                if (a == b) {
                    System.out.print(a + " ");
                }
            }
        }
        System.out.println();
    }
}
