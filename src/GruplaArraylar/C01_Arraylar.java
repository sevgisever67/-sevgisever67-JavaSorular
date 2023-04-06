package GruplaArraylar;

import java.util.Arrays;

public class C01_Arraylar {
    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
       // olusturun. Eski array’i yeni haliyle kaydedin.
        int []arr={1,2,3,4,5,};
        ElmnArttrma(arr,5);
        System.out.println(Arrays.toString(arr));


    }public static int[] ElmnArttrma(int [] arr, int artiş){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=artiş;

        }return arr;

    }



}
