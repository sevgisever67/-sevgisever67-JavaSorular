package studymyself.studyMyself;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın ve
        // kullanıcı ne girerse girsin -128 / 127 arasında yazdırsın.

        Scanner scanner=new Scanner(System.in);
        System.out.println("1 değer girin giriniz");
        double sayı= scanner.nextDouble();
        byte byt =(byte) sayı;
        System.out.println(byt);




    }

}
