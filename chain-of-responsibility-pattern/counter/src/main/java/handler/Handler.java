package handler;

public abstract class Handler {
    Handler handler;

    public Handler(Handler handler){
        this.handler = handler;
    }
    public abstract void handle(int count);

    public Handler getNextHandler(){
        return handler;
    }
}
