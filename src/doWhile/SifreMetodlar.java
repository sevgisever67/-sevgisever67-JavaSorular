package doWhile;

import java.util.Scanner;

public class SifreMetodlar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sifre = "";
        int flag=0;
        System.out.println("Lütfen bir şifre giriniz:");
        do {
            sifre = scan.nextLine();
            flag=0;
            int küçükHarf = 0;
            int büyükHarf = 0;
            int özelKarakter = 0;

            if (!(sifre.length() >= 8)) {
                flag++;
                System.out.println("Şifre en az 8 karakter olmalıdır.");
                continue;
            }

            for (int i = 0; i < sifre.length(); i++) {
                char harf = sifre.charAt(i);
                if (Character.isLowerCase(harf)) {
                    küçükHarf++;
                } else if (Character.isUpperCase(harf)) {
                    büyükHarf++;
                } else if (!Character.isLetterOrDigit(harf)) {
                    özelKarakter++;
                }
            }

            if (küçükHarf == 0) {
                flag++;
                System.out.println("Şifre küçük harf içermelidir.");
            }
            if (büyükHarf == 0) {
                flag++;
                System.out.println("Şifre büyük harf içermelidir.");
            }
            if (özelKarakter == 0) {
                flag++;
                System.out.println("Şifre özel karakter içermelidir.");
            }

            if (flag != 0) {
                System.out.println("Girdiğiniz şifre istenilen şartları sağlamıyor.\n" +
                        "Lütfen tekrar deneyin.");
            }

        } while (flag != 0);

        System.out.println("Şifreniz kabul edilmiştir.");
    }
}