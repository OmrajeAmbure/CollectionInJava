package Coupling;

import Coupling.Loose.EmailNotificationService;
import Coupling.Loose.NotificationService;
import Coupling.Loose.SMSService;
import Coupling.Tight.SMSNotificationService;
import Coupling.Tight.UserService ;


public class Demo {
    public static void main(String[] args) {
        // tight coupling
        UserService service = new UserService();
        service.NotifyUser("order placed");


        // loose coupling
        NotificationService emailNotificationService = new EmailNotificationService();
        NotificationService smsService = new SMSService();
        // Constructor Injection in DI
        Coupling.Loose.UserService m1 = new Coupling.Loose.UserService(emailNotificationService);
        Coupling.Loose.UserService m2 = new Coupling.Loose.UserService(smsService);
        // Seter Injection in DI
        Coupling.Loose.UserService m3 = new Coupling.Loose.UserService();
        m3.setNt(emailNotificationService);
        m3.setNt(smsService);
        // Filed Injection in DI
        m3.nt = emailNotificationService;
        m3.nt = smsService;

        m1.notifyUser("order processed");
        m2.notifyUser("order complete");
    }
}
