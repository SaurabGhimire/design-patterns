package bank.integration;

public class EmailSender {
    private static EmailSender instance;
    private EmailSender(){
        System.out.println("Inside constructor");
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }
    public  void sendEmail(String receiver, String message){
        System.out.println("Sending email to: " + receiver  + " with message :" + message);
    }

    public static synchronized EmailSender getInstance() {
        if (instance == null) {
            instance = new EmailSender();
        }
        return instance;
    }
}
