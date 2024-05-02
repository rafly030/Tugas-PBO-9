public class ReplaceString {
    public static void main(String[] args) {
        String string1= "Hello How Are You";
        String GantiKarakter = string1.replace('H','T');
        String GantiKalimat = string1.replace("hello", "Good Morning");
        System.out.println("Untuk Replace karakter : "+GantiKarakter);
        System.out.println("Untuk Replace kalimat : "+GantiKalimat);
    }
}

// Output
// untuk replace karakter : Hello How Are You
// Untuk replace kalimat : Good Morning How Are You
