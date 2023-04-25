package hastaneOtomasyon;

import java.util.Random;
import java.util.Scanner;

public class Runner2 {private static
    Hastane hastane1 = new Hastane();
    static int sıraNo=0;
    public static void main(String[] args) {

        System.out.println("****** Yıldız Hsstanesi *******");
        HastaKayıtKabul();
    }

    private static void HastaKayıtKabul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen adınızı giriniz");
        String isim= scan.nextLine();
        System.out.println("lütfen soyadınızı giriniz");
        String soyİsim= scan.nextLine();
        System.out.println("Sikayetinizi giriniz : ");
        String sikayet = scan.nextLine();

        hastane1.setDoktor(DoktorBul(sikayet));
        System.out.println("Doktor ismi : " + hastane1.doktor.getIsim());
        System.out.println("Doktor Soyismi : " + hastane1.doktor.getSoyisim());
        System.out.println("Doktor Unvani : " + hastane1.doktor.getUnvan());
        DurumAciliyet(sikayet);
        sıraNo++;
        if (sıraNo>5){
            System.exit(0);
            System.out.println("Hasta Kaydımız Kapanmıştır. Bugün Git Yarın Gel ");

        }else {
            System.out.println("hsta kayıt sıranız : "
                    + sıraNo + " Tahmini bekleme süreniz : "+ sıraNo*2 + " dk.");
        }


        HastaKayıtKabul();


    }

    private static Doktor DoktorBul(String sikayet) {
        for (int i = 0; i < hastane1.doktorIsimleri.size(); i++) {
            if (sikayet.equalsIgnoreCase(hastane1.durumlar.get(i))) {
                hastane1.doktor.setIsim(hastane1.doktorIsimleri.get(i));
                hastane1.doktor.setSoyisim(hastane1.doktorSoyisimleri.get(i));
                hastane1.doktor.setUnvan(hastane1.unvanlar.get(i));
            }
        }return hastane1.doktor;
    }
    public static void DurumAciliyet(String sikayet) {


        switch (sikayet.toLowerCase()){
            case "allerji"   :
                System.out.println("Hasta durumu : Yeşil Alan");break;
            case "bas agrisi":
                System.out.println("Hasta durumu : Yeşil Alan");break;
            case "diabet"   :
                System.out.println("Hasta durumu : Yeşil Alan");break;
            case "soguk alginligi":
                System.out.println("Hasta durumu : Yeşil Alan");break;
            case "migren"   :
                System.out.println("Hasta durumu : Kırmızı alan Acil");break;
            case "kalp hastaliklari":
                System.out.println("Hasta durumu : Kırmızı alan Acil");break;
            default:
                System.out.println("Geçersiz Hastalık girişi");
                HastaKayıtKabul();


        }
    }
}
