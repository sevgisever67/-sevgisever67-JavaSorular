package arrayMetod;

import java.util.Arrays;

public class ArayTopla {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki
        //pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.
        int []arr={4,5,-6,9,2,-3};
        System.out.println(ArrElmnTopl(arr));
        int toplam=ArrElmnTopl(arr);
        System.out.println(toplam);




    }

    public static int ArrElmnTopl(int [] arr) {
        int Toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                Toplam+=arr[i];
            }

        }
        return Toplam;
    }
}
