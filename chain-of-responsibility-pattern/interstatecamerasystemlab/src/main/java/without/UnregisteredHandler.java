package without;

public class UnregisteredHandler extends  Handler{
    public  UnregisteredHandler(Handler handler){
        super(handler);
    }
    @Override
    public void handle(CameraRecord cameraRecord) {
        System.out.println("Detecting if the car is not registered");
        getNextHandler().handle(cameraRecord);
    }
}
