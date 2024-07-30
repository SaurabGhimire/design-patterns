package without;

public class SpeedingHandler extends  Handler{
    public  SpeedingHandler(Handler handler){
        super(handler);
    }
    @Override
    public void handle(CameraRecord cameraRecord) {
        System.out.println("Detecting if the car is speeding");
        getNextHandler().handle(cameraRecord);
    }
}
