package bank.adapter;

import bank.domain.Customer;

public class CustomerAdapter {
    public CustomerDTO getCustomerDTO(Customer customer){
        return  new CustomerDTO(customer.getName());
    }

    public Customer getCustomer(CustomerDTO customerDTO){
        return  new Customer(customerDTO.getName());
    }
}
