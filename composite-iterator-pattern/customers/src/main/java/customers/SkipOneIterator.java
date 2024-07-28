package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class SkipOneIterator implements Iterator<Customer> {
    int index;
    List<Customer> customers;

    public SkipOneIterator(List<Customer> customers){
        this.customers = customers;
        index = 0;
    }

    public void forEach(Consumer<Customer> consumer){
        while(hasNext()){
            consumer.accept(next());
        }
    }

    @Override
    public boolean hasNext() {
        return index < (customers.size() - 2);
    }

    @Override
    public Customer next() {
        if(index < (customers.size() - 2)){
            Customer customer = customers.get(index);
            index = index+ 2;
            return customer;
        }
        return  null;
    }
}
