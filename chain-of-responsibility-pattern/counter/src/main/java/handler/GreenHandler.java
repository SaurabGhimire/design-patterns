package handler;

public class GreenHandler extends Handler{

    public  GreenHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handle(int count) {
        if(count == 12 || count ==13){
            handler.getNextHandler().handle(count);
            return;
        } else if(count >= 10 ){
            System.out.println("Green");
        }
        handler.getNextHandler().handle(count);
    }
}
