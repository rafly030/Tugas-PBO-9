public class EqualString {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "hello";
        String string3 = "hello";
        System.out.println("Hasilnya : " + string1.equals(string2));
        System.out.println("Hasilnya : " + string1.equals(string3));
    }
}

// Output
// Hasilnya : true
// Hasilnya : false
