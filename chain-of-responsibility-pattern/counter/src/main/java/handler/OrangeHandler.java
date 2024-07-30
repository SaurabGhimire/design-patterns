package handler;

public class OrangeHandler extends Handler{
    public  OrangeHandler(Handler handler){
        super(handler);
    }

    @Override
    public void handle(int count) {
        if(count == 17 || count ==19){
            return;
        } else if(count >=15 && (count%2 != 0)){
            System.out.println("Orange");
        }
    }
}
