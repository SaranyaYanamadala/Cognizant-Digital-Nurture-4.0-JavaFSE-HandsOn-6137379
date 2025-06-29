public class LinearSearchImpl {
    public Product linearSearch(Product[] products, String name) {
        System.out.println("Searching for products Linear Search.");
        for(Product product : products) {
            if(product.name.equalsIgnoreCase(name)) {
                return product;
            }
        }

        return null;
    }
}
