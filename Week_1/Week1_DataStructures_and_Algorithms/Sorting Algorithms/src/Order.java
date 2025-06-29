public class Order {
    String orderid;
    String customerName;
    double totalPrice;

    public Order(String orderid, String customerName, double totalPrice) {
        this.orderid = orderid;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getDetails(){
        return "Order ID : " + this.orderid + "\n"
                + "Customer Name : " + this.customerName + "\n"
                + "Total Price : " + this.totalPrice + "\n";
    }
}