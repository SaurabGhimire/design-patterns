package counter;

import observer.Subject;

public class Counter extends Subject {
	
	private int count=0;

	public void increment(){
		count++;
		doNotify(count);
	}
	
	public void decrement(){
		count--;
		doNotify(count);
	}
}
