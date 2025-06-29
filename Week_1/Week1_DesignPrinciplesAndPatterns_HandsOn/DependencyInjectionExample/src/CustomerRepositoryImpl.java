public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerByID(int id) {
        return "Customer " + id + " Devi Saranya Yanamadala.";
    }
}
