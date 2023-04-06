package doWhile;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.
                Girilen sifreyi asagidaki sartlara gore
        kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */

        Scanner scan = new Scanner(System.in);


        String sifre = "";
        int flag = 0;

        do {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            flag = 0;
            int büyükHarf = 0;
            int küçükHarf = 0;
            int özelKarakter = 0;


            for (int i = 0; i < sifre.length(); i++) {
                char harf = sifre.charAt(i);
                if (harf > 40 && harf < 57) {
                    flag++;
                    özelKarakter++;
                    break;
                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf1 = sifre.charAt(i);
                if (harf1 >='A' && harf1 <= 'Z') {
                    büyükHarf++;
                    flag++;
                    break;
                }
            }
            for (int i = 0; i < sifre.length(); i++) {
                char harf2 = sifre.charAt(i);
                if (!(harf2 >='a' && harf2 <='z')) {
                    küçükHarf++;
                    flag++;
                    break;

                }


            } if (özelKarakter == 0) {
                System.out.println("şifre özel karakter içermeli");
            }
            if (büyükHarf == 0) {
                System.out.println("şifre büyük harf içermeli");
            }
            if (küçükHarf == 0) {
                System.out.println("şifre küçük harf içermeli");
            }if (!(sifre.length() >= 8)) {
                System.out.println("en az 8 karakter olmalı");
            }

        }while (flag != 3) ;
        System.out.println("şifreniz kabul edilmiştir.");
    }
}


