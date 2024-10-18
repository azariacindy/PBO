public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String email;
    private String doc;

    // constructor
    public UserProfile(int userId, String password, String name, int age, String email, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    // getters
    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void editProfile(String password, String name, int age, String email) {
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void showdoc() {
        System.out.println("doc: " + doc);
    }
}
