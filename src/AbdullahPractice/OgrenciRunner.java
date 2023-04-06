package AbdullahPractice;

import java.util.ArrayList;
import java.util.List;

public class OgrenciRunner {
        /*
           /*
        ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR.
KAYITLARDA ŞU BİLGİLER OLMALIDIR:
    -AD SOYAD
    -KİMLİK NO
    -YAŞ
    -NUMARA
    -SINIF  BİLGİLERİNİ İÇERMELİDİR.
2. ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
    SEÇİMİNİZ:
  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
NOT: PROJEYİ YAPARKEN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
         */
        public static void main(String[] args) {
            List<ogrenci> ogrListe=new ArrayList<>();
            ogrenci ogrenci1=new ogrenci("Sevgi","keleş","sdhdshjdhcgdg",15,192,12);
            ogrListe.add(ogrenci1);
            ogrenci ogrenci2=new ogrenci("Sevcan","tuna","sdhdshjsh",17,132,11);
            ogrListe.add(ogrenci2);
            ogrenci ogrenci3=new ogrenci("ayse","tan","sdhdshshj",13,122,8);
            ogrListe.add(ogrenci3);
            İslemler işlemler=new İslemler();
            işlemler.menu(ogrListe);


        }
}
