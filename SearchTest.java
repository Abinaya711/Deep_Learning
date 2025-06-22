
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shoes", "Footwear"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Watch", "Accessories"),
            new Product(4, "Mobile", "Electronics"),
            new Product(5, "Bag", "Luggage")
        };
        System.out.println("Linear Search Result:");
        Product result1 = SearchEngine.linearSearch(products, "Watch");
        System.out.println(result1 != null ? result1 : "Product not found");
        Arrays.sort(products); 
        System.out.println("\nBinary Search Result:");
        Product result2 = SearchEngine.binarySearch(products, "Watch");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
