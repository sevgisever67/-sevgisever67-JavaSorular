package doWhile;

import java.util.Scanner;

public class SifreSorusu {
    public static void main(String[] args) {
        //- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir
        Scanner scan=new Scanner(System.in);


        boolean sifreDogruMu = false;

        while (!sifreDogruMu) {
            System.out.println("Lütfen şifrenizi giriniz");
            String sifre = scan.nextLine();

            if (!sifre.matches(".*[a-z].*")) {
                System.out.println("Hata: Şifre küçük harf içermelidir.");
                continue;
            }

            if (!sifre.matches(".*[A-Z].*")) {
                System.out.println("Hata: Şifre büyük harf içermelidir.");
                continue;
            }

            if (!sifre.matches(".*[^a-zA-Z0-9].*")) {
                System.out.println("Hata: Şifre özel karakter içermelidir.");
                continue;
            }

            if (sifre.length() < 8) {
                System.out.println("Hata: Şifre en az 8 karakter olmalıdır.");
                continue;
            }

            sifreDogruMu = true;
        }

        System.out.println("Şifreniz Kabul edilmistir.");


    }
}
