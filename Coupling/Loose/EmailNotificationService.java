package Coupling.Loose;

public class EmailNotificationService  implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Notification from (Email) :- "+message);
    }
}
