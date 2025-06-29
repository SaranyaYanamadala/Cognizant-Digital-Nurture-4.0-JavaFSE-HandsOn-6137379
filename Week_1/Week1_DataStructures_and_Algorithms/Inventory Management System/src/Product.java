public class Product {
    private int productID;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productID, String productName, int quantity, double price) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // setter methods
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }

    // getter methods
    public int getProductID() {
        return this.productID;
    }

    public String getProductName() {
        return this.productName;
    }

    public int getProductQuantity() {
        return this.quantity;
    }

    public double getProductPrice() {
        return this.price;
    }

    public String getProductDetails(Product product) {
        return "Product ID : " + product.productID + ", "
                + "\nProduct Name : " + product.productName + ", "
                + "\nProduct Quantity : " + product.quantity + ", "
                + "\nProduct Price : " + product.price  + ".\n";
    }
}