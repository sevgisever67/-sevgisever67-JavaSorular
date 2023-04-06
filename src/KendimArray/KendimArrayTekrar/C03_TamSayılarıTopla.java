package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C03_TamSayılarıTopla {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        //method yaziniz.

        int []arr={1,2,3,-4,-5,-6};

        System.out.println(Arrays.toString(arr));

        int toplam=PozitifSayılarıTopla(arr);
        System.out.println(toplam);

    }
    public static int PozitifSayılarıTopla (int [] arr){
        int toplam=0;
        for (int i =0; i< arr.length; i++){

            if (arr[i]>0){

                 toplam+=arr[i];
            }
        }
        return toplam;

    }



}
