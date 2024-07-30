package states;

import counter.Counter;

public class DoubleDigitState extends CounterState{
    public DoubleDigitState(Counter counter){
        super(counter);
    }
    @Override
    public void updateCount(int sign) {
        int count = counter.getCount() + 2 * sign;
        counter.setCount(count);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if(counter.getCount() > 99){
            CounterState doubleDigitState = new TripleDigitState(counter);
            counter.setCounterState(doubleDigitState);
        } else if(counter.getCount() < 10){
            CounterState singleDigitState = new SingleDigitState(counter);
            counter.setCounterState(singleDigitState);
        }
    }
}
