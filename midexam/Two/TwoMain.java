public class TwoMain {
    public static void main(String[] args) {
        // creating a UserProfile object
        UserProfile userProfile = new UserProfile(1, "pass123", "Azaria", 25, "Azaria@gmail.com", "ian.jpg");

        // creating a Customer object
        Customer customer = new Customer(1, "pass123", "Cindy", 22, "cindy@gmail.com", "joko.png");
        customer.logIn();
        customer.applyVerification("ian.png");
        System.out.println("Verification status: " + customer.getVerificationStatus());

        // creating an Admin object
        Admin admin = new Admin(2, "adminpass", "Adminn", 30, "adminn@gmail.com", "adminDoc.pdf");
        admin.logIn();
        admin.updateUserDetails();
        admin.verifyUser();
    }
}
