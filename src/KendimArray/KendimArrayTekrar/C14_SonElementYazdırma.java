package KendimArray.KendimArrayTekrar;

import java.util.Arrays;

public class C14_SonElementYazdırma {
    public static void main(String[] args) {
         //Soru 5- Verilen 2 katli bir array’de
        // her bir inner array’in son elementlerinin
       // toplaminini yazdiran bir method olusturun.

       int [][] arr = {{3,1,2,4},{1,2},{5,4,9}};
        toplamlarArrayi(arr);


    }public static  void  toplamlarArrayi (int[][] arr){

        int toplam=0;
        int [] ToplamlarArray=new int[1];
        for (int i = 0; i < arr.length; i++) {

            for (int j = arr[i].length-1; j < arr[i].length; j++) {
                toplam += arr[i][j];


            }

        }
        ToplamlarArray[0]=toplam;
        System.out.println(Arrays.toString(ToplamlarArray));
    }
}
