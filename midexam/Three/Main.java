public class Main {
    public static void main(String[] args) {
        // creating a UserProfile object
        UserProfile userProfile = new UserProfile(1, "pass123", "Azaria", 25, "Azaria@gmail.com", "ian.jpg");
        userProfile.showdoc(); // menggunakan showdoc method
        userProfile.editProfile("newpass456", "Azaria Updated", 26, "azariaUpdated@gmail.com"); // menggunakan editProfile method

        // creating a Customer object
        Customer customer = new Customer(1, "pass123", "Cindy", 22, "cindy@gmail.com", "joko.png");
        customer.logIn(); // menggunakan logIn method tanpa parameter
        customer.logIn(1, "pass123"); // menggunakan logIn method dengan parameter
        customer.applyVerification("ian.png"); // menggunakan applyVerification method
        System.out.println("Verification status: " + customer.getVerificationStatus()); // mengecek status verifikasi
        customer.recoverPassword(); // menggunakan recoverPassword method
        customer.logOut(); // menggunakan logOut method

        // creating an Admin object
        Admin admin = new Admin(2, "adminpass", "Adminn", 30, "adminn@gmail.com", "adminDoc.pdf");
        admin.logIn(); // menggunakan logIn method tanpa parameter
        admin.logIn(2, "adminpass"); // menggunakan logIn method dengan parameter
        admin.updateUserDetails(); // menggunakan updateUserDetails method
        admin.verifyUser(); // menggunakan verifyUser method
        admin.reviewComplaint(); // menggunakan reviewComplaint method
        admin.logOut(); // menggunakan logOut method
    }
}
