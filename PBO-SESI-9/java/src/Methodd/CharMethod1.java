package Methodd;

public class CharMethod1 {
    public static void main(String[] args) {
        String placebirth[] = {"BANDUNG","SURAKARTA","SUKABUMI","JAKARTA","YOGYAKARTA"};

        int totalmcity = 0;
        for(int i=0;i<placebirth.length;i++){
            char prefix = placebirth[i].charAt(0);
            if (prefix=='M'){
                totalmcity++;
            }
        }
        System.out.println(totalmcity);
    }
}
