package without;

public class StolenHandler extends  Handler{
    public  StolenHandler(Handler handler){
        super(handler);
    }
    @Override
    public void handle(CameraRecord cameraRecord) {
        System.out.println("Detecting if the car is stolen");
        getNextHandler().handle(cameraRecord);
    }
}
