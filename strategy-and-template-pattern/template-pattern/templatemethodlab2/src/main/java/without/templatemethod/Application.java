package without.templatemethod;

import with.templatemethod.PaypalProcessor;
import with.templatemethod.VisaCardProcessor;
import with.templatemethod.PaymentProcessor;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Frank Brown", "fbrown@gmail.com");
		VisaCard visaCard = new VisaCard("1111 2222 3333 4444", "Frank Brown", "09/2026",112);
		PaymentProcessor paymentProcessor = new VisaCardProcessor(
				125.75, "USD",  customer1, visaCard
		);
		paymentProcessor.proccessPayment();
		
		System.out.println("------------------------------------");
		
		Customer customer2 = new Customer("John Doe", "jdoe@gmail.com");
		paymentProcessor = new PaypalProcessor(175000.0, "INR",customer2, "jdoe@gmail.com");
		paymentProcessor.proccessPayment();

	}
}
