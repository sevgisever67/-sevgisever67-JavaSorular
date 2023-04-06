package WhileLoop;

import java.util.Scanner;

public class ÜsslüSayılar {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("sayi ve üssünü giriniz");
        int sayi= scan.nextInt();
        int üs=scan.nextInt();

        ÜssüHesapla(sayi,üs);


    }

    private static void ÜssüHesapla(int sayi, int üs) {
        int çarpım=1;
        while (üs!=0){
            üs--;
            çarpım*=sayi;
        }
        System.out.println(çarpım);
    }
}
