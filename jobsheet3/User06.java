package jobsheet3;

public class User06 {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User06(String username, String nama, String email){
        this.username = username;
        this.nama = nama;
        this.email = email;
    }

    public void disInfo(){
        System.out.println("Username : " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("==========================");
    }
}
