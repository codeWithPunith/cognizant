public class Main {

    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Watch", "Accessories")
        };

     
        System.out.println("Linear Search:");
        Product result1 = LinearSearch.search(products, "Phone");
        System.out.println(result1);

      
        System.out.println("\nBinary Search:");

        BinarySearch.sort(products); 
        Product result2 = BinarySearch.search(products, "Phone");
        System.out.println(result2);
    }
}