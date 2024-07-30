package without;

public class UnpaidTicketHandler extends  Handler{
    public UnpaidTicketHandler(Handler handler){
        super(handler);
    }
    @Override
    public void handle(CameraRecord cameraRecord) {
        System.out.println("Detecting if the car has unpaid tickets.");

    }
}

