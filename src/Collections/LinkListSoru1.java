package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkListSoru1 {
    public static void main(String[] args) {
        /*
        Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi
birakmak icin 0’a basmalidir.
Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
liste1 : …….
liste2 : …….
ortak elementler : …….

         */

        System.out.println("önce list 1 i oluştur");
        List<String>List1=kullanıcıdanalaraklistoluştur();
        System.out.println("List 2 yi oluştur");
        List<String>List2=kullanıcıdanalaraklistoluştur();
        System.out.println("Liste1 : "+ List1);
        System.out.println("Liste2 : "+ List2);
        List1.retainAll(List2);
        System.out.println("ortak elemanlar"+ List1);

    }
    public static List<String> kullanıcıdanalaraklistoluştur(){
        List<String>isimListesi=new LinkedList<>();   Scanner scan =new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek istediğiniz ismi girin\n" +
                    "bitirmek için 0'a basınız");

             isim=scan.nextLine();
            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }

        }
        return isimListesi;

    }
}
