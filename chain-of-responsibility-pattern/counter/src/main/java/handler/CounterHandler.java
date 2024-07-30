package handler;

import observer.Observer;

public class CounterHandler implements Observer {
    Handler handler;
    public CounterHandler(Handler handler){
        this.handler = handler;
    }

    @Override
    public void update(int count) {
        handler.handle(count);
        handler.getNextHandler().handle(count);
    }
}
