public class Substring {
    public static void main(String[] args) {
        String hello = "Welcome to Menyala Abangkuh Team";
        System.out.println("Hasilnya adalah : " + hello.substring(1, 7));
        System.out.println("Hasilnya adalah : " + hello.substring(5, hello.length()));
    }
}

// Output
// Hasilnya adalah : Welcome
// Hasilnya adalah : me to Menyala Abangkuh Team
