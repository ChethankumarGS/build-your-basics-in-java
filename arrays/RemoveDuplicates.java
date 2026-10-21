import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 7, 2, 9};
        Set<Integer> unique = new LinkedHashSet<>();
        for (int num : arr) {
            unique.add(num);
        }
        System.out.println("Without duplicates: " + unique);
        System.out.println("Original: " + Arrays.toString(arr));
    }
}
