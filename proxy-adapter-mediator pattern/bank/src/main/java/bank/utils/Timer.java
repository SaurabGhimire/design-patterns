package bank.utils;

public class Timer {
    private long start = 0;
    private  long stop = 0;

    public void start(){
        start = System.currentTimeMillis();
    }

    public void stop(){
        stop = System.currentTimeMillis();
    }

    public long getTime(){
        return stop - start;
    }
}
