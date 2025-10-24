package Coupling.Loose;

public class SMSService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Notification from (SMS) :- "+message);
    }
}
