package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C17_kullanıcıdanalarakListOluşturmak {
    public static void main(String[] args) {
       // Soru 2- Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize
       // liste olarak dondurecek bir method olusturun.
        System.out.println(ListeOluştur());
        System.out.println(KullanıcıdanAlarakListeoluştur());


    }
    /**************1.ÇÖZÜM YOLU********************/
    public  static List ListeOluştur (){

        List<String> girilenİsimlerListesi=new ArrayList<>();
        String girilenİsim ="";
        while (!girilenİsim.equalsIgnoreCase("q")){
            Scanner scan =new Scanner(System.in);
            System.out.println("Lütefen Bir İsim Giriniz");
             girilenİsim= scan.nextLine();
            if (!girilenİsim.equalsIgnoreCase("q")){
                girilenİsimlerListesi.add(girilenİsim);

            }
        };
        return  girilenİsimlerListesi;


    }
       /**************2.ÇÖZÜM YOLU********************/

    public static List<String> KullanıcıdanAlarakListeoluştur(){
        List<String> isimler=new ArrayList<>();
        String girilenİsim="";
        Scanner scan =new Scanner(System.in);
        do {
            System.out.println("Lütfem Listeyi oluşturacak isimleri girin \n" +
                    "en son ismi girdiğinizde 'q' basınız" );
            girilenİsim=scan.nextLine();
           if (!girilenİsim.equalsIgnoreCase("q"));
            isimler.add(girilenİsim);


        }while (!girilenİsim.equalsIgnoreCase("q"));
        return isimler;

    }



}
