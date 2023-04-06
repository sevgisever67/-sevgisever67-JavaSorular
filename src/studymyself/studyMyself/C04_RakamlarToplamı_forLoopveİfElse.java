package studymyself.studyMyself;

import java.util.Scanner;

public class C04_RakamlarToplamı_forLoopveİfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamaklı pozitif bir tamsayı gir");
        int girilenSayı = scan.nextInt();
        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;

        for (int i = girilenSayı; i > 0; i/=10) {
            if (girilenSayı > 999 && girilenSayı < 100000) {
                birlerBasamağı = i % 10;
                rakamlarToplamı += birlerBasamağı;

            } else {
                System.out.println("geçersiz sayı girişi");
            }
        }

        System.out.println("Rakamlar toplamı : " + rakamlarToplamı);
    }
}
