package model;

public class EmailSender implements Notifier {
	
	@Override
	public void notify(String email, String formattedContent) {
        // Simulando envio de email
        System.out.println("Sending email to " + email + ":\n" + formattedContent);
    }
	
}

