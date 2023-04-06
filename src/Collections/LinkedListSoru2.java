package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListSoru2 {static List<Double>notListesi=new LinkedList<>();
    public static void main(String[] args) {
        /*
        Soru : Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
output hazirlayin
not ortalamasi : …..
ogrenci sayisi : …..
ortalama altindaki ogrenci sayisi : ….
ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : ….
         */
        System.out.println("öğrenci listesini oluşturalım");
        notListesineDeğerEkle();
        System.out.println(notListesi);
        double nottoplamı=0;
        double notOrtalaması;
        int ortalamAltındakiÖğrenciSayısı=0;
        int ortalamanın10puanaltındakiÖğrencisayısı=0;
        for (double eachNot:notListesi) {
            nottoplamı+=eachNot;
        }
        notOrtalaması=nottoplamı/notListesi.size();
        for (double eachnot:notListesi) {
            if (eachnot<notOrtalaması){
                ortalamAltındakiÖğrenciSayısı++;
            } else if (eachnot<notOrtalaması-10||eachnot>notOrtalaması+10) {
                ortalamanın10puanaltındakiÖğrencisayısı++;
            }
        }

        System.out.println("not ortalaması : "+ notOrtalaması+
                "ortalamanın altındaki öğrenci sayısı : " +
                ""+ ortalamAltındakiÖğrenciSayısı+ "\n" +
                "ortalamanın10PuanaltÜst öğrenci sayısı : "+ortalamanın10puanaltındakiÖğrencisayısı);


    }

    public static void notListesineDeğerEkle() {
        Scanner scan=new Scanner(System.in);
        double not;
        boolean loopDevam=true;
        while (loopDevam){
            try {
                System.out.println("öğrenci notlerını giriniz bitirmek için q ya basınız");
                not=scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {
                String girilenDeğer=scan.nextLine();
                if (girilenDeğer.equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("not için sayısal değerler giriniz");
                }
            }
        }

    }
}
