public class Product {
    int productID;
    String name, category;

    public Product(int productID, String name, String category) {
        this.productID = productID;
        this.name = name;
        this.category = category;
    }

    public void getAvailableProducts(Product product) {
        System.out.println("Product ID : " + product.productID + "\nProduct Name : " + product.name + "\nProduct Category : " + product.category + ".\n");
    }
}