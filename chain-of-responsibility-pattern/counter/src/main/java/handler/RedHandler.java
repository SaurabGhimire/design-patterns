package handler;

public class RedHandler extends Handler{
    public  RedHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handle(int count) {
        if((count %2 == 0 && count<10) || (count == 12)){
            System.out.println("Red");
            return;
        }
        getNextHandler().handle(count);
    }
}
