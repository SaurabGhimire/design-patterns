package customers;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Filter;

public class FilterIterator implements Iterator<Customer> {
    List<Customer> customers;
    Predicate<Customer> predicate;
    int index;

    FilterIterator(List<Customer> customers, Predicate<Customer> predicate){
        this.customers = customers;
        this.predicate = predicate;
        this.index = 0;
    }

    public void forEach(Consumer<Customer> consumer){
        while(hasNext()){
            consumer.accept(next());
        }
    }

    @Override
    public boolean hasNext() {
        int currentIndex = index;
        while(currentIndex < customers.size()){
            Customer customer = customers.get(currentIndex++);
            if(predicate.test(customer)) return true;
        }
        return false;
    }

    @Override
    public Customer next() {
        int currentIndex = index;
        while(currentIndex < customers.size()){
            Customer customer = customers.get(currentIndex++);
            if(predicate.test(customer)) {
                index = currentIndex + 1;
                return customer;
            }
        }
        return null;
    }
}
