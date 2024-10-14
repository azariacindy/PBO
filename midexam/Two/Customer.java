public class Customer extends User{
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String email, String doc) {
        super(userId, password, name, age, email, doc);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    // to apply verification with doc
    public void applyVerification(String document) { 
        verificationStatus = true;
        System.out.println("Verification applied with document: " + document);
    }
}
