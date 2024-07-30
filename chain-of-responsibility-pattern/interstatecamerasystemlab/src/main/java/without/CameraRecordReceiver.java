package without;



public class CameraRecordReceiver {
	Handler handler;

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	private void handle(CameraRecord cameraRecord){
		handler.handle(cameraRecord);
	}
	
	public void receiveCameraRecord(CameraRecord cameraRecord) {
		System.out.println("receiving "+cameraRecord);
		handle(cameraRecord);
	}


}
