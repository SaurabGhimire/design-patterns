package counter;

import observer.Subject;
import states.CounterState;
import states.SingleDigitState;

public class Counter extends Subject {
	
	private int count=1;
	CounterState counterState;

	public Counter(){
		this.counterState = new SingleDigitState(this);
	}

	public void increment(){
		counterState.updateCount(1);
		doNotify(count);
	}
	
	public void decrement(){
		counterState.updateCount(-1);
		doNotify(count);
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCounterState(CounterState counterState) {
		this.counterState = counterState;
	}
}
