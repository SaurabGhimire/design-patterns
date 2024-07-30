package handler;

public class BlueHandler extends Handler{
    public BlueHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handle(int count) {
        if(count == 17 || count == 19){
            System.out.println("Blue");
            return;
        } else if(count < 15 && (count %2 != 0)){
            System.out.println("Blue");
            return;
        }
        handler.getNextHandler().handle(count);
    }
}
