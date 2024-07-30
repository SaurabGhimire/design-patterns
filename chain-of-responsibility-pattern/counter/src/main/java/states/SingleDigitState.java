package states;

import counter.Counter;

public class SingleDigitState extends CounterState{
    public SingleDigitState(Counter counter){
        super(counter);
    }
    @Override
    public void updateCount(int sign) {
        int count = counter.getCount() + 1 * sign;
        counter.setCount(count);
        checkForUpgrade();
    }

    @Override
    public void checkForUpgrade() {
        if(counter.getCount() > 9){
            CounterState doubleDigitState = new DoubleDigitState(counter);
            counter.setCounterState(doubleDigitState);
        }
    }
}
