public class CustomerService {
    private final CustomerRepository customerRepo;

    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public void getCustomerDetails(int id) {
        String customer = customerRepo.findCustomerByID(id);
        System.out.println("Customer found. " + customer);
    }
}
