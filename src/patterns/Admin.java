package patterns;

public class Admin implements User {
    @Override
    public void performAction() {
        System.out.println("Admin is managing the system.");
    }
}
