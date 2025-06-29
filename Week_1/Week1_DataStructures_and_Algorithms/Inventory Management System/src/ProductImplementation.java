import java.util.HashMap;

public class ProductImplementation {
    private HashMap<Integer, Product> products;

    public ProductImplementation() {
        products = new HashMap<>();
    }

    // Add product
    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    // Update product
    public void updateProduct(int productID, String productName, int quantity, double price) {
        Product updatingProduct = products.get(productID);

        // if the product is not present
        if(updatingProduct == null) {
            System.out.println("Product with product ID " + productID + " is not found.");
        } else {
            updatingProduct.setProductName(productName);
            updatingProduct.setProductQuantity(quantity);
            updatingProduct.setProductPrice(price);
        }
    }

    // Remove product
    public void removeProduct(int productID) {
        Product remove = products.get(productID);

        // If product is not present
        if(remove == null) {
            System.out.println("Product with product ID " + productID + " is not found.");
        } else {
            products.remove(productID);
        }
    }

    // Get products
    public void getAvailableProducts() {
        for(Product product : products.values()) {
            System.out.println(product.getProductDetails(product));
        }
    }
}
