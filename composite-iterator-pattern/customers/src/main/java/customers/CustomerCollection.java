package customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerCollection implements Iterator {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Customer next() {
		return null;
	}
}
