package GruplaArraylar;

import java.util.Arrays;

public class C03_sağaKaydırma {
    public static void main(String[] args) {
        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
        int []arr={1,2,3,4,5,};
        Sağakaydırma(arr);



    }public  static void Sağakaydırma (int []arr){
        int temp= arr[arr.length-1];
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]= arr[i-1];

        }arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }

}

