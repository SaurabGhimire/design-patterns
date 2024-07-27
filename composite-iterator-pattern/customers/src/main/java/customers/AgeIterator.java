package customers;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class AgeIterator implements Iterator<Customer> {
    private final List<Customer> customers;
    private int index;

    public AgeIterator(List<Customer> customers){
        this.customers = customers.stream().sorted(Comparator.comparing(Customer::getAge).reversed()).collect(Collectors.toList());
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < customers.size() - 1;
    }

    @Override
    public Customer next() {
        return customers.get(index++);
    }
}
