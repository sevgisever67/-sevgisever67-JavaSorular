package arrayMetod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fibonacc {
    public static void main(String[] args) {
          /*
        Soru 5- Kullanicidan pozitif bir tamsayi alip,
        o tamsayidan kucuk Fibonacci sayilarini
        bir liste olarak bize donduren bir method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        List<Integer> fibonacci = fibonacciListesi(sayi);
        System.out.println(fibonacci);
    }

    public static List<Integer> fibonacciListesi(int sayi) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = a + b;

        list.add(a);
        list.add(b);


        while (c < sayi) {
            list.add(c);

            a = b;
            b = c;
            c = a + b;

        }
        return list;

    }
}
