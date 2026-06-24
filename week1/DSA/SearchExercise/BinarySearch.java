import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {

    public static Product search(Product[] arr, String name) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = arr[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return arr[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    // helper to sort array before binary search
    public static void sort(Product[] arr) {
        Arrays.sort(arr, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}