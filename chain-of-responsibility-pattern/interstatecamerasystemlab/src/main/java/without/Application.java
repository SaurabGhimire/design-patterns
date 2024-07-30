package without;



public class Application {

	public static void main(String[] args) {
		CameraRecordReceiver cameraRecordReceiver = new CameraRecordReceiver();

		UnpaidTicketHandler unpaidTicketHandler = new UnpaidTicketHandler(null);
		UnregisteredHandler unregisteredHandler = new UnregisteredHandler(unpaidTicketHandler);
		SpeedingHandler speedingHandler = new SpeedingHandler(unregisteredHandler);
		StolenHandler stolenHandler = new StolenHandler(speedingHandler);

		cameraRecordReceiver.setHandler(stolenHandler);

		Camera camera = new Camera(cameraRecordReceiver);

		camera.generateCameraRecords();

	}

}
