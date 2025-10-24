package Coupling.Loose;

public class UserService {
    public NotificationService nt;
    public UserService(){}
    public UserService(NotificationService nt){
        this.nt = nt;
    }
    public void notifyUser(String message){
        nt.send(message);
    }
    public void setNt(NotificationService nt) {
        this.nt = nt;
    }
}
