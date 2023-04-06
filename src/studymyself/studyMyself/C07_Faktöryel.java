package studymyself.studyMyself;

import java.util.Scanner;

public class C07_Faktöryel {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scan=new Scanner(System.in);
        System.out.println("20 den kjüçük bir sayı giriniz");
        int girilensayı=scan.nextInt();
        int faktöryel=1;

        System.out.print(girilensayı + " ! = ");

        for (int i = girilensayı; i >=1 ; i--) {

            faktöryel*=i;

            if (i>1){
                System.out.print(i + " * ");
            }else {
                System.out.print(i+ " ");
            }


        }System.out.println( " = "+ faktöryel);

    }

}
