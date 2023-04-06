package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C02_ArraysTümElamanlarıarttır {
    public static void main(String[] args) {

       // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
       // olusturun. Eski array’i yeni haliyle kaydedin.

        int []arr={1,2,3,4,5,6};
        arr=tümElemanlarıArttır(arr,9);
        System.out.println(Arrays.toString(arr));

    }public static int[] tümElemanlarıArttır (int []ilkArr , int ArtışMiktarını){
        for (int i =0; i<ilkArr.length; i++){
            ilkArr [i]+=ArtışMiktarını;

        }return ilkArr;

    }

}
