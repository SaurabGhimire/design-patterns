package without;

public abstract class Handler {
    Handler handler;
    Handler(Handler handler){
        this.handler = handler;
    }
    public abstract void handle(CameraRecord cameraRecord);

    public Handler getNextHandler(){
        return handler;
    }
}
