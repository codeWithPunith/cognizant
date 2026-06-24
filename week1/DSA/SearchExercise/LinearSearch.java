public class LinearSearch {

    public static Product search(Product[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].productName.equalsIgnoreCase(name)) {
                return arr[i];
            }
        }
        return null;
    }
}