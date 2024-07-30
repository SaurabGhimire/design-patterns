package states;

import counter.Counter;

public class TripleDigitState extends CounterState {
    public TripleDigitState(Counter counter){
        super(counter);
    }
    @Override
    public void updateCount(int sign) {
        int count = counter.getCount() + 3 * sign;
        counter.setCount(count);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
         if(counter.getCount() < 100){
            CounterState doubleDigitState = new DoubleDigitState(counter);
            counter.setCounterState(doubleDigitState);
        }
    }
}
