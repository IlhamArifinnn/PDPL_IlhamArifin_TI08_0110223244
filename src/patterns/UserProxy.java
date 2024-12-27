package patterns;

public class UserProxy implements User {
    private User user;
    private boolean isAdmin;

    public UserProxy(User user, boolean isAdmin) {
        this.user = user;
        this.isAdmin = isAdmin;
    }

    @Override
    public void performAction() {
        if (isAdmin) {
            user.performAction();
        } else {
            System.out.println("Access Denied. Only admins are allowed.");
        }
    }
}
