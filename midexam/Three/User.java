public class User extends UserProfile {
    // constructor
    public User(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
    }

    public void logIn(int userId, String password) {
        System.out.println("User " + getName() + " logged in with credentials!");
    }

    public void logIn() {
        System.out.println("User " + getName() + " logged in!");
    }

    public void recoverPassword() {
        System.out.println("Password recovery process initiated for user " + getName() + ".");
    }

    public void logOut() {
        System.out.println("User " + getName() + " logged out!");
    }
}
