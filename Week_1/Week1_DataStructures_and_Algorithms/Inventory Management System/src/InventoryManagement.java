public class InventoryManagement {
    public static void main(String[] args) {
        ProductImplementation inventory = new ProductImplementation();

        Product jeans = new Product(1, "H&M High Waist Jeans", 10, 1000.0);
        Product tops = new Product(2, "Floral Top", 5, 250.0);
        Product sandles = new Product(18, "Black Sandles", 5, 500.0);
        Product tshirts = new Product(52, "Women T-Shirts", 15, 250.0);

        // Add all the products to the list
        inventory.addProduct(jeans);
        inventory.addProduct(tops);
        inventory.addProduct(sandles);
        inventory.addProduct(tshirts);

        // Get all the available products
        inventory.getAvailableProducts();

        // Update the jeans product with new quantity and price
        inventory.updateProduct(1, "H&M High Waist Jeans", 50, 2000.0);

        // Get all the available products after inventory update
        System.out.println("After updation of Inventory.");
        inventory.getAvailableProducts();

        // deleting sandles product
        inventory.removeProduct(18);

        // Available products
        System.out.println("After deletion of product from Inventory.");
        inventory.getAvailableProducts();
    }
}
