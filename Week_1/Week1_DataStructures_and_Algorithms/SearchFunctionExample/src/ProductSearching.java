public class ProductSearching {
    public static void main(String[] args) {
        Product[] products = { new Product(101, "Laptop", "Electronics"),
                                new Product(102, "Shoes", "Fashion"),
                                new Product(103, "Mobile", "Electronics"),
                                new Product(104, "Watch", "Accessories")
                            };

        // Searching for products which are present
        LinearSearchImpl linear = new LinearSearchImpl();
        Product linear_found = linear.linearSearch(products, "Watch");
        System.out.println((checkIfFound(linear_found)));

        BinarySearchImpl binary = new BinarySearchImpl();
        Product binary_found = binary.binarySearch(products, "Watch");
        System.out.println((checkIfFound(binary_found)));

        // Searching for products which are not present
        Product linear_notfound = linear.linearSearch(products, "Gaming Laptop");
        System.out.println((checkIfFound(linear_notfound)));

        Product binary_notfound = binary.binarySearch(products, "Sandles");
        System.out.println((checkIfFound(binary_notfound)));

    }

    public static String checkIfFound(Product found) {
        return (found != null)? "Product is found.\n" : "Product is not found.\n";
    }
}
