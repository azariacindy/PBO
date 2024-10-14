public class Admin extends User {
    public Admin(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
    }

    public void updateUserDetails() {
        System.out.println("User details updated for user ID: " + getUserId());
    }

    public void reviewComplaint() {
        System.out.println("Reviewing complaints...");
    }

    public void verifyUser() {
        System.out.println("User " + getName() + " verified.");
    }
}
