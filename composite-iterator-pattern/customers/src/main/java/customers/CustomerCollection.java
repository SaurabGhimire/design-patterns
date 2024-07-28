package customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		AgeIterator ageIterator = getAgeIterator();
		while(ageIterator.hasNext()){
			Customer customer = (Customer) ageIterator.next();
			System.out.println(customer);
		}
	}

	public AgeIterator getAgeIterator() {
		return new AgeIterator(customers);
	}

	public FilterIterator getFilterIterator(Predicate<Customer> predicate) {
		return new FilterIterator(customers, predicate);
	}

	public SkipOneIterator getSkipOneIterator() {
		return new SkipOneIterator(customers);
	}
}
