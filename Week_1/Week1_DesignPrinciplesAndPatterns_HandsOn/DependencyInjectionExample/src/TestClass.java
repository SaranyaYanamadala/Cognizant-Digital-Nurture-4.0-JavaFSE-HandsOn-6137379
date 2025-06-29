public class TestClass {
    public static void main(String[] args) {
        CustomerRepositoryImpl customerImpl = new CustomerRepositoryImpl();
        CustomerService customerServ = new CustomerService(customerImpl);

        customerServ.getCustomerDetails(101);
    }
}
