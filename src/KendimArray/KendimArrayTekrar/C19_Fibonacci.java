package KendimArray.KendimArrayTekrar;

import java.util.ArrayList;
import java.util.List;

public class C19_Fibonacci {
    public static void main(String[] args) {
         // Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
        // sayisini bir list olarak donduren bir method olusturun.
        System.out.println(fibonacciSerisi(25));


    }public static List<Integer > fibonacciSerisi(int sayıAdedi){
        List<Integer>fibonacciSerisi=new ArrayList<>();
        if (sayıAdedi<0){
            System.out.println("yanlış giriş");
        } else if (sayıAdedi==1) {
            fibonacciSerisi.add(0);
        } else if (sayıAdedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else {
            int ilkSayı=0;
            fibonacciSerisi.add(0);
            int ikinciSayi=1;
            fibonacciSerisi.add(1);
            int yeniSayı=ilkSayı+ikinciSayi;
            fibonacciSerisi.add(yeniSayı);
            while (fibonacciSerisi.size()<sayıAdedi){
                ilkSayı=ikinciSayi;
                ikinciSayi=yeniSayı;
                yeniSayı=ikinciSayi+ilkSayı;
                fibonacciSerisi.add(yeniSayı);
            }




        }

        return fibonacciSerisi;
    }

}
