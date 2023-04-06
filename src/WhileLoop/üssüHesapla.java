package WhileLoop;

import java.util.Scanner;

public class üssüHesapla {
    public static void main(String[] args) {
        ÜssünüHesapla();
    }

    private static void ÜssünüHesapla() {
        Scanner scan =new Scanner(System.in);
        System.out.println("sayi ve üssünü giriniz");
        int sayi= scan.nextInt();
        int üs=scan.nextInt();

        while (üs!=1){
            sayi*=sayi;
            üs--;
        }

        System.out.println(sayi);

    }
}
