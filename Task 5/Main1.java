// MessageSender interface
interface MessageSender {
    void sendMessage(String message);
}

// EmailSender implements MessageSender
class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

// NotificationService depends on the abstraction
class NotificationService {

    private MessageSender messageSender;

    // Constructor Injection
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Create EmailSender object
        MessageSender emailSender = new EmailSender();

        // Inject dependency into NotificationService
        NotificationService notificationService = new NotificationService(emailSender);

        // Send notification
        notificationService.alertUser("Your order has been shipped!");
    }
}
