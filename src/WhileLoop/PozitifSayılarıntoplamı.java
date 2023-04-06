package WhileLoop;

import java.util.Scanner;

public class PozitifSayılarıntoplamı {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
        //istediginde 0'a basmasini soyleyin
        //Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        //bunlarin toplaminin kac oldugunu yazdirin
        //Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        //negatif sayiyi sayi adedine ve toplama eklemeyin
        Scanner scan=new Scanner(System.in);

        int girileSayi=1;
        int toplam=0;
        int sayiAdedi=0;

        while (girileSayi!=0){
            System.out.println("Toplanmasını istediğiniz sayıları giriniz\n" +
                    "bitirmek istediğinizde 0 a basınız");
             girileSayi= scan.nextInt();

            if (girileSayi>0){
                toplam+=girileSayi;
                sayiAdedi++;
            }

        }
        System.out.println("Girilen sayıların toplamı : "+ toplam+ " girilen sayi adedi : "+ sayiAdedi);

    }
}
