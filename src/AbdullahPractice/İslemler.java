package AbdullahPractice;

import java.util.List;
import java.util.Scanner;

public class İslemler {
    static Scanner scan = new Scanner(System.in);
    //ogrenci numara=100;

    void menu(List<ogrenci> ogrListe) {
        System.out.println("============= İŞLEMLER ==============\n" +
                "  1-EKLEME\n" +
                "  2-ARAMA\n" +
                "  3-LİSTELEME\n" +
                "  4-SİLME\n" +
                "  Q-çıkış \n" +
                "SEÇİMİNİZ:");

        Scanner scan = new Scanner(System.in);
        char seçim = scan.next().toUpperCase().charAt(0);
        switch (seçim) {
            case '1':
                Ekleme();
            case '2':
                ARAMA();
            case '3':
                LİSTELEME();
            case '4':
                SİLME();
            case 'Q':
                çıkış();
                
        }
    }

    private void çıkış() {
    }

    private void SİLME() {
    }

    private void LİSTELEME() {
    }

    private void ARAMA() {
    }

    private void Ekleme() {
        System.out.println("öğrenci adınızı giriniz");
        String öAdı=scan.nextLine();
        System.out.println("öğrencinin soyadını giriniz");
        String öSoyadı= scan.nextLine();
        System.out.println("tc gir");
        String tc=scan.nextLine();
        System.out.println("yaşı gir");
        int yas= scan.nextInt();
        System.out.println("sınıf gir");
        int sınıf= scan.nextInt();
        //ogrenci öğrenci=new ogrenci(öAdı,öSoyadı,tc,yas,sınıf,);


    }
}
