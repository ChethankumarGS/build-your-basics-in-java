public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "success";
        int[] counts = new int[256];
        for (char ch : str.toCharArray()) {
            counts[ch]++;
        }
        char maxChar = ' ';
        int max = 0;
        for (char ch : str.toCharArray()) {
            if (counts[ch] > max) {
                max = counts[ch];
                maxChar = ch;
            }
        }
        System.out.println("Max occurring character in " + str + " is '" + maxChar + "' (" + max + " times)");
    }
}
