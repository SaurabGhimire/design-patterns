package states;

import counter.Counter;

public abstract class CounterState {
    Counter counter;
    CounterState(Counter counter){
        this.counter = counter;
    }
    public abstract void updateCount(int count);
    public abstract void checkForUpgrade();
}
