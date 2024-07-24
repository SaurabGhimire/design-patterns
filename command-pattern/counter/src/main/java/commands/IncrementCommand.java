package commands;

import counter.Counter;

public class IncrementCommand implements Command{
    Counter counter;

    public IncrementCommand(Counter counter){
        this.counter = counter;
    }
    @Override
    public void execute() {
        counter.increment();
    }

    @Override
    public void unexecute() {
        counter.decrement();
    }
}
