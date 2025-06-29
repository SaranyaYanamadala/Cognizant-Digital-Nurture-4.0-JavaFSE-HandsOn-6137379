import java.util.Arrays;
import java.util.Comparator;

public class BinarySearchImpl {
    public Product binarySearch(Product[] products, String name) {
        System.out.println("Searching for products using Binary Search.");
        sortProducts(products);

        int left = 0, right = products.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].name.compareToIgnoreCase(name);

            if(cmp == 0) {
                return products[mid];
            } else if(cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.name.toLowerCase()));
    }
}
