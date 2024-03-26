package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id) {
        Optional<Customer> optionalCustomer = Optional.empty();
        return optionalCustomer.orElse(null);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
;
    public Customer updateCustomer(Integer id, Customer customer) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()) {
            Customer existingCustomer = optionalCustomer.get();
            existingCustomer.setName(customer.getName());
            existingCustomer.setOrderId(customer.getOrderId());
            existingCustomer.setEmailId(customer.getEmailId());
            
            return customerRepository.save(existingCustomer);
        }
        return null; 
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteAll();
    }
}
