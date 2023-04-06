package WhileLoop;

import java.util.Scanner;

public class Üsslerr {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        //kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        //olusturun.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi ve üssünü giriniz");
        int girilenSayi = scan.nextInt();
        int üss = scan.nextInt();

        ÜssünüH(girilenSayi,üss);

    }

    private static void ÜssünüH(int sayi, int üsSayi) {
        int çarpim=1;
        while (üsSayi!=0){
            çarpim*=sayi;
            üsSayi--;
        }
        System.out.println(çarpim);
    }
}
