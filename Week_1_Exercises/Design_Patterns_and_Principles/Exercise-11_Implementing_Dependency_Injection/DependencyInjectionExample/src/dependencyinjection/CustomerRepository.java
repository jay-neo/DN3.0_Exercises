package dependencyinjection;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
