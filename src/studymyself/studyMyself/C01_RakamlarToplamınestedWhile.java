package studymyself.studyMyself;

import java.util.Scanner;

public class C01_RakamlarToplamınestedWhile {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int rakamlarToplamı = 0;
                int birlerBasmağı = 0;

                while (rakamlarToplamı != 22) {
                    System.out.println("Lütfen Bir Sayı Giriniz");
                    int girilenSayı = scan.nextInt();
                    int sayı = girilenSayı;
                    rakamlarToplamı = 0;               //her döngüde rakamlar toplamını sıfırlıyoruz ki
                    while (sayı > 0) {                //daha önce girdiğimiz sayılatın rakamlar toplamına eklenmesi.
                        birlerBasmağı = sayı % 10;
                        rakamlarToplamı += birlerBasmağı;
                        sayı /= 10;
                    }
                }
                System.out.println( "girdiğiniz sayının rakamlar toplamı: "+ rakamlarToplamı);

            }

        }









