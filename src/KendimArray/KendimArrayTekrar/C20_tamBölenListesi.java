package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C20_tamBölenListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        //        tamsayilari bir liste olarak bize donduren bir method olusturun.
        System.out.println(tamBolenlerListesi());

    }public static List<Integer> tamBolenlerListesi(){

        Scanner scanner=new Scanner(System.in);
        List <Integer> tamBölenlerlistesi=new ArrayList<>();
        System.out.println("lütfen bir tam sayı giriniz");
        int tamsayi= scanner.nextInt();
        for (int i = 2; i <tamsayi ; i++) {
            if (tamsayi%i==0){
                tamBölenlerlistesi.add(i);
            }

        }return tamBölenlerlistesi;



    }



}

