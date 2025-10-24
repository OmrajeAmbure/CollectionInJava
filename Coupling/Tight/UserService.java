package Coupling.Tight;

public class UserService {
        NotificationService nt = new NotificationService();
        // here big change occur tight coupling
        SMSNotificationService nt2= new SMSNotificationService();

        public void NotifyUser(String message){
            nt.send(message);
            nt2.send(message);
        }
}
