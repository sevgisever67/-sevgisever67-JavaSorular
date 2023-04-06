package manavProjesi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class manavSorusu {


    /*
    asit bir 5 ürünlü manav alisveris programi yaziniz.
     1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     2. Adim : Baska bir urun almak isteyip istemedigini sor.
                istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                Bu işlemi alisverisi bitirmek isteyene kadar tekrarlayın.
     3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
    */
    static List<String> ürünListesi = new ArrayList<>(Arrays.asList("1.portakal", "2.limon", "3.elma"));
    static List<Integer> fiyatListesi = new ArrayList<>(Arrays.asList(15, 25, 17));
    public static void main(String[] args) {


        System.out.println("**********BİZİM MANAV***********");

        ürünSeç();

    }

    public static void ürünSeç() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <ürünListesi.size() ; i++) {
            ürünListesi.get(i);
        }
        System.out.println(ürünListesi);

        System.out.println("almak istediğiniz ürünü giriniz");
        int seçilenÜrün= scan.nextInt();
        System.out.println("kaç kilo istersiniz");
        int kilosu=scan.nextInt();
        int toplamTutar=kilosu*fiyatListesi.get(seçilenÜrün-1);


        System.out.println("Alışverise devam etmek istiyor musunuz? E/H");
        char AlışverişeDevamMı=scan.next().toLowerCase().charAt(0);
        if (AlışverişeDevamMı=='h'){
            System.out.println("Ödemeniz gereken toplam tutar : "+toplamTutar);

        }else {
            ürünSeç();
        }
    }

}

